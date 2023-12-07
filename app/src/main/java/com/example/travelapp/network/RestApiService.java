package com.example.travelapp.network;

import com.example.travelapp.model.Destination;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.GET;

public interface RestApiService {
    @GET("destination/all")
    Call<Destination> getAllDestination();
}
