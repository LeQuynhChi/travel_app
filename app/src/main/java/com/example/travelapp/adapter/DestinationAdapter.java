package com.example.travelapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.travelapp.R;
import com.example.travelapp.model.Destination;
import com.example.travelapp.viewHoder.DestinationViewHolder;
import com.squareup.picasso.Picasso;

import java.util.List;

public class DestinationAdapter extends RecyclerView.Adapter<DestinationViewHolder> {
    private List<Destination.Data> destinationList;
    private Context context;

    private LayoutInflater inflater;

    public DestinationAdapter(Context context, List<Destination.Data> destinationList) {
        this.context = context;
        this.destinationList = destinationList;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public DestinationViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.rcv_location_item, parent, false);
        return new DestinationViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DestinationViewHolder holder, int position) {
        Destination.Data item = destinationList.get(position);
        holder.textViewType.setText(item.getType());
        holder.textViewName.setText(item.getName());
        holder.textViewProvince.setText(item.getProvince());
        String imageUrl = "https://trimmap-ohte.onrender.com/img/"+item.getImage();
        Picasso.get().load(imageUrl).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return destinationList.size();
    }

}
