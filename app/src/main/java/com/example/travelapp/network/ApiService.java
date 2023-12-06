package com.example.travelapp.network;

import com.example.travelapp.response.DestinationResponse;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public interface ApiService  {
    Gson gson = new GsonBuilder().setDateFormat("dd-MM_yyy").create();

    ApiService apiService = new Retrofit.Builder()
            .baseUrl("http://localhost:5000/")
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build().create(ApiService.class);

    @GET("destination/all")
    Call<DestinationResponse> getAllDestination();
}
