package com.example.travelapp.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import com.example.travelapp.R;
import com.example.travelapp.adapter.DestinationAdapter;
import com.example.travelapp.model.Destination;
import com.example.travelapp.network.RestApiService;
import com.example.travelapp.network.RetrofitInstance;
import com.example.travelapp.viewHoder.DestinationViewHolder;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class HomeFragment extends Fragment {
    RecyclerView recyclerView;
    DestinationAdapter adapter;
    DestinationViewHolder viewHodel;
    LinearLayout ln_location, ln_hotel, ln_restaurant;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
//        recyclerView = view.findViewById(R.id.data_home);
//        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
//        fetchListDestination();

        ln_location = view.findViewById(R.id.linear_location);
        ln_hotel = view.findViewById(R.id.linear_hotel);
        ln_restaurant = view.findViewById(R.id.linear_res);

        ln_location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Chuyển đến Fragment LocationFragment
                replaceFragment(new LocationFragment());
            }
        });

        ln_hotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Chuyển đến Fragment HotelFragment
                replaceFragment(new HotelFragment());
            }
        });

        ln_restaurant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Chuyển đến Fragment RestaurantFragment
                replaceFragment(new RestaurantFragment());
            }
        });
        return view;
    }

    private void replaceFragment(Fragment fragment) {
        FragmentTransaction transaction = requireActivity().getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.content_frame, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }

    private  void  fetchListDestination(){
        RestApiService apiService = RetrofitInstance.getApiService();
        Call<Destination> call = apiService.getAllDestination();
        call.enqueue(new Callback<Destination>() {
            @Override
            public void onResponse(Call<Destination> call, Response<Destination> response) {
                Destination destinationList = response.body();
            }
            @Override
            public void onFailure(Call<Destination> call, Throwable t) {
            }
        });

    }

}