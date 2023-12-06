package com.example.travelapp.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.travelapp.R;
import com.example.travelapp.adapter.DestinationAdapter;
import com.example.travelapp.model.Destination;
import com.example.travelapp.network.ApiService;
import com.example.travelapp.response.DestinationResponse;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HomeFragment extends Fragment {
     RecyclerView recyclerView;
     DestinationAdapter adapter;

     private  DestinationResponse destinationResponse;





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        recyclerView = view.findViewById(R.id.data_home);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        fetchListDestination();
        return view;
    }

    private  void  fetchListDestination(){
        ApiService.apiService.getAllDestination().enqueue(
                new Callback<DestinationResponse>() {
                    @Override
                    public void onResponse(Call<DestinationResponse> call, Response<DestinationResponse> response) {
                        destinationResponse= response.body();
                        adapter = new DestinationAdapter(getActivity(), destinationResponse.getDestinationList());
                        recyclerView.setAdapter(adapter);
                    }

                    @Override
                    public void onFailure(Call<DestinationResponse> call, Throwable t) {
                    }
                }
        );
    }

}
