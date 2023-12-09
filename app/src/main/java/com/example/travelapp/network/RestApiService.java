package com.example.travelapp.network;

import com.example.travelapp.model.Destination;
import com.example.travelapp.model.Hotel;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface RestApiService {
    @GET("destination/all")
    Call<Destination> getAllDestination();

    @GET("destination/get/{id}")
    Call<Destination.Data> getDestinationById(@Path("id") String id);
    @GET("hotel/all")
    Call<Hotel> getAllHotel();
    @GET("destination/all")
    Call<Destination> getProvinceVn();
}
