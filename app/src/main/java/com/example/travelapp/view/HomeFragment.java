package com.example.travelapp.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.travelapp.R;
import com.example.travelapp.adapter.DestinationAdapter;
import com.example.travelapp.model.Destination;
import com.example.travelapp.network.RestApiService;
import com.example.travelapp.network.RetrofitInstance;
import com.example.travelapp.viewModel.DestinationViewModel;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class HomeFragment extends Fragment {
    RecyclerView recyclerView;
    DestinationAdapter adapter;

    DestinationViewModel viewModel;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        recyclerView = view.findViewById(R.id.data_home);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        fetchListDestination();
        return view;
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