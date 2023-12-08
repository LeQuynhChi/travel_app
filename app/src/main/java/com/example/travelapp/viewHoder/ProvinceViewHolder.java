package com.example.travelapp.viewHoder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.travelapp.R;

public  class ProvinceViewHolder extends RecyclerView.ViewHolder {
        public TextView textProvince;


        public ProvinceViewHolder(View itemView) {
            super(itemView);
            textProvince = itemView.findViewById(R.id.location_province);
        }
    }