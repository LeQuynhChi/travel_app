package com.example.travelapp.repository;

import android.app.Application;
import androidx.lifecycle.MutableLiveData;

import com.example.travelapp.model.Destination;
import com.example.travelapp.network.RestApiService;
import com.example.travelapp.network.RetrofitInstance;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DestinationRepository {

    private ArrayList<Destination.Data> des = new ArrayList<>();
    private MutableLiveData<List<Destination.Data>> mutableLiveData = new MutableLiveData<>();
    private Application application;
    public DestinationRepository(Application application) {
        this.application = application;
    }

    public MutableLiveData<List<Destination.Data>> getAllDestination() {
//        RestApiService apiService = RetrofitInstance.getApiService();
//        Call<Destination> call = apiService.getAllDestination();
//        call.enqueue(new Callback<Destination>() {
//            @Override
//            public void onResponse(Call<Destination> call, Response<Destination> response) {
//                Destination destinationList = response.body();
//                if (destinationList != null && destinationList.getData() != null) {
//                    des = (ArrayList<Destination.Data>) destinationList.getData();
//                    mutableLiveData.setValue(des);
//                }
//            }
//            @Override
//            public void onFailure(Call<Destination> call, Throwable t) {
//            }
//        });
        return mutableLiveData;
    }

}
