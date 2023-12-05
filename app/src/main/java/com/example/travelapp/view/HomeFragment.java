package com.example.travelapp.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.travelapp.R;
import com.example.travelapp.adapter.DestinationAdapter;
import com.example.travelapp.model.Destination;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {
     RecyclerView recyclerView;
     DestinationAdapter adapter;





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        recyclerView = view.findViewById(R.id.data_home);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        List<Destination> data = generateSampleData(); // Replace with your data source
        adapter = new DestinationAdapter(getActivity(), data);
        recyclerView.setAdapter(adapter);

        return view;
    }




    private List<Destination> generateSampleData() {
        List<Destination> data = new ArrayList<>();
        data.add(new Destination("Destination 1", "Province A"));
        data.add(new Destination("Destination 2", "Province B"));
        return data;
    }
}
