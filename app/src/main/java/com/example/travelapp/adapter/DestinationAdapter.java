package com.example.travelapp.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.travelapp.R;
import com.example.travelapp.model.Destination;

import java.util.List;

public class DestinationAdapter extends RecyclerView.Adapter<DestinationAdapter.DestinationViewHolder> {

    private List<Destination> destinationList;
    public void setData(List<Destination> list) {
        this.destinationList = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public DestinationViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rcv_location_item, parent, false);

        return new DestinationViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DestinationViewHolder holder, int position) {
        // set du lieu len
        Destination destination = destinationList.get(position);
        if (destination == null){
            return;
        }
        holder.txt_name.setText(destination.getDestination_name());
        holder.txt_dis.setText(destination.getDescription());
        holder.txt_loc.setText(destination.getLocation());
    }

    @Override
    public int getItemCount() {
        if (destinationList != null){
            return destinationList.size();
        }
        return 0;
    }

    public class DestinationViewHolder extends RecyclerView.ViewHolder{

        private TextView txt_name, txt_dis, txt_loc;

        public DestinationViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
