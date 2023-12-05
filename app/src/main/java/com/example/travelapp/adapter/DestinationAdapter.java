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

import java.util.List;

public class DestinationAdapter extends RecyclerView.Adapter<DestinationViewHolder> {
    private List<Destination> destinationList;
    private Context context;

    private LayoutInflater inflater;

    public DestinationAdapter(Context context, List<Destination> destinationList) {
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
        Destination item = destinationList.get(position);
        holder.textViewType.setText("dsjgfs");
        holder.textViewName.setText("jasj");
    }

    @Override
    public int getItemCount() {
        return destinationList.size();
    }

}
