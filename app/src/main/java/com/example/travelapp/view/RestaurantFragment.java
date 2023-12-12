package com.example.travelapp.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.travelapp.R;
import com.example.travelapp.adapter.OnItemClickListener;
import com.example.travelapp.adapter.RestaurantAdapter;
import com.example.travelapp.model.Restaurant;
import com.example.travelapp.network.RestApiService;
import com.example.travelapp.network.RetrofitInstance;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RestaurantFragment extends Fragment {
    RecyclerView recyclerView;
    RestaurantAdapter adapter;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_restaurant,container,false);

        recyclerView = view.findViewById(R.id.data_restaurant);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireActivity()));
//        openViewAddHotel(view);
        fetchListRst();
        return view;

    }

    private  void  fetchListRst(){
        RestApiService apiService = RetrofitInstance.getApiService();
        Call<Restaurant> call = apiService.getAllRst();
        call.enqueue(new Callback<Restaurant>() {
            @Override
            public void onResponse(Call<Restaurant> call, Response<Restaurant> response) {
                adapter = new RestaurantAdapter(getActivity(),response.body().getData(),(OnItemClickListener) requireActivity());
                recyclerView.setAdapter(adapter);
            }
            @Override
            public void onFailure(Call<Restaurant> call, Throwable t) {
            }
        });

    }
}
