package com.example.travelapp.view;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.travelapp.R;
import com.example.travelapp.model.Destination;
import com.example.travelapp.model.Hotel;
import com.example.travelapp.network.RestApiService;
import com.example.travelapp.network.RetrofitInstance;
import com.squareup.picasso.Picasso;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HotelDetailActivity extends AppCompatActivity  {

    TextView hotelDetailName , hotelDetailAddress, hotelDetailDescription, hotelDetailPrice;
    ImageView hotelDetailImage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hotel);
        Intent intent = getIntent();
        String id = intent.getStringExtra("id");

        hotelDetailName = findViewById(R.id.hotelDetailName);
        hotelDetailAddress = findViewById(R.id.hotelDetailAddress);
        hotelDetailPrice = findViewById(R.id.hotelDetailPrice);
        hotelDetailDescription = findViewById(R.id.hotelDetailDescription);
        hotelDetailImage = findViewById(R.id.hotelDetailImage);



        RestApiService apiService = RetrofitInstance.getApiService();
        Call<Hotel.Data> call = apiService.getHotelById(id);
        call.enqueue(new Callback<Hotel.Data>() {
            @Override
            public void onResponse(Call<Hotel.Data> call, Response<Hotel.Data> response) {
               hotelDetailName.setText(response.body().getName());
               hotelDetailAddress.setText(response.body().getDistrict()+" - " + response.body().getProvince());
               hotelDetailDescription.setText(response.body().getDescription());
               hotelDetailPrice.setText(response.body().getPrice());
                String imageUrl = "https://trimmap-ohte.onrender.com/img/"+response.body().getImage();
                Picasso.get().load(imageUrl).into(hotelDetailImage);

            }
            @Override
            public void onFailure(Call<Hotel.Data> call, Throwable t) {
                System.out.println("jsdhhj");
            }
        });


        // đổi màu cho các icon mỗi khi click vào
        // bắt sự kiện khi click các item trong navigationBar_menu
    }


}