package com.example.travelapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.travelapp.R;
import com.example.travelapp.model.Hotel;
import com.example.travelapp.model.Restaurant;
import com.example.travelapp.viewHoder.HotelViewHolder;
import com.example.travelapp.viewHoder.RestaurantViewHolder;
import com.squareup.picasso.Picasso;

import java.util.List;

public class RestaurantAdapter extends RecyclerView.Adapter<RestaurantViewHolder> {
    private List<Restaurant.Data> resList;
    private Context context;

    private LayoutInflater inflater;

    private OnItemClickListener itemClickListener;

    public RestaurantAdapter(Context context, List<Restaurant.Data> resList , OnItemClickListener itemClickListener) {
        this.context = context;
        this.resList = resList;
        this.inflater = LayoutInflater.from(context);
        this.itemClickListener = itemClickListener;
    }

    @NonNull
    @Override
    public RestaurantViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.rcv_hotel_item, parent, false);
        return new RestaurantViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RestaurantViewHolder holder, int position) {
        Restaurant.Data item = resList.get(position);
//        holder.textHotelName.setText(item.getName());
//        holder.txtHotelAddress.setText(item.getProvince());
//        holder.txtHotelPrice.setText(item.getPrice());
//        String imageUrl = "https://trimmap-ohte.onrender.com/img/"+item.getImage();
//        Picasso.get().load(imageUrl).into(holder.imageView);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (itemClickListener != null) {
                    itemClickListener.onItemClickRestaurant(item.getId());
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return resList.size();
    }

}
