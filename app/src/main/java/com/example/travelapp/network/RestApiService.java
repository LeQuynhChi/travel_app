package com.example.travelapp.network;

import com.example.travelapp.model.Destination;
import com.example.travelapp.model.Hotel;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface RestApiService {
    @GET("destination/all")
    Call<Destination> getAllDestination();

    @GET("destination/get/{id}")
    Call<Destination.Data> getDestinationById(@Path("id") String id);
    @GET("hotel/get/{id}")
    Call<Hotel.Data> getHotelById(@Path("id") String id);
    @GET("hotel/all")
    Call<Hotel> getAllHotel();


    @Multipart
    @POST("destination/create")
    Call<Destination.Data> createDestination(
            @Part("name") RequestBody name,
            @Part("description") RequestBody description,
            @Part("province") RequestBody province,
            @Part("district") RequestBody district,
            @Part("type") RequestBody type,
            @Part MultipartBody.Part image
    );
}
