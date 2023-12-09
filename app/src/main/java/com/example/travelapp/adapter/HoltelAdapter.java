package com.example.travelapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.travelapp.R;
import com.example.travelapp.model.Hotel;
import com.example.travelapp.viewHoder.HotelViewHolder;
import com.squareup.picasso.Picasso;

import java.util.List;

public class HoltelAdapter extends RecyclerView.Adapter<HotelViewHolder> {
    private List<Hotel.Data> hotelList;
    private Context context;

    private LayoutInflater inflater;

    public HoltelAdapter(Context context, List<Hotel.Data> hotelList) {
        this.context = context;
        this.hotelList = hotelList;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public HotelViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.rcv_hotel_item, parent, false);
        return new HotelViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HotelViewHolder holder, int position) {
        Hotel.Data item = hotelList.get(position);
        holder.textHotelName.setText(item.getName());
        holder.txtHotelAddress.setText(item.getProvince());
        holder.txtHotelPrice.setText(item.getPrice());
        String imageUrl = "https://trimmap-ohte.onrender.com/img/"+item.getImage();
        Picasso.get().load(imageUrl).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return hotelList.size();
    }

}
