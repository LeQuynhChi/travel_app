package com.example.travelapp.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.travelapp.R;

public class LocationFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_location, container, false);

        Button openAddLocationView = view.findViewById(R.id.openAddLocationView);

        // Now you can work with the Button as needed
        openAddLocationView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open SecondActivity when the button is clicked
                openNewActivity();
            }
        });

        return view;
    }

    private void openNewActivity() {
        Intent intent = new Intent(requireActivity(), AddDestination.class);
        startActivity(intent);
    }
}
