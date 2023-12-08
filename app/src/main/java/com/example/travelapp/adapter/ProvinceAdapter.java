package com.example.travelapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.travelapp.R;
import com.example.travelapp.model.Destination;
import com.example.travelapp.model.Province;
import com.example.travelapp.viewHoder.DestinationViewHolder;
import com.example.travelapp.viewHoder.ProvinceViewHolder;
import com.squareup.picasso.Picasso;

import java.util.List;

public class ProvinceAdapter extends RecyclerView.Adapter<ProvinceViewHolder> {

    private List<Province> provinceList;
    private Context context;

    private LayoutInflater inflater;

    public ProvinceAdapter(Context context, List<Province> provinceList) {
        this.context = context;
        this.provinceList = provinceList;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ProvinceViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.add_location, parent, false);
        return new ProvinceViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProvinceViewHolder holder, int position) {
       Province item = provinceList.get(position);
//        holder.textProvince.setText();
    }

    @Override
    public int getItemCount() {
        return provinceList.size();
    }
}
