package com.example.travelapp.view;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.travelapp.R;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.List;

public class AddDestination extends AppCompatActivity {

    ImageView btnArrowBack ;
    Button btnBack , buttonAddImageDestination, saveLocation;


    TextView editTextLocationName, textLocationDescription;

    Spinner  spinnerLocationType ,spinnerLocationProvince, spinnerLocationDistrict;


    ImageView imageViewLocation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_location);
        innitSpinner();
        onClickBackAddLocationArr();
        onClickBackAddLocationBtn();
        onClickAddImageLocationBtn();
        onClickAddLocationBtn();


    }

    public void innitSpinner() {
       spinnerLocationType = findViewById(R.id.spinnerLocationType);
        List<String> spinnerData = new ArrayList<>();
        spinnerData.add("Item 1");
        spinnerData.add("Item 2");
        spinnerData.add("Item 3");
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, spinnerData);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerLocationType.setAdapter(adapter);

    }

    private void onClickBackAddLocationArr() {
        btnArrowBack = findViewById(R.id.location_arrow_back);
        btnArrowBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                closeActivity();
            }
        });
    }
    private void onClickBackAddLocationBtn() {
        btnBack = findViewById(R.id.backAddLocation);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                closeActivity();
            }
        });
    }
    private void onClickAddLocationBtn() {
        saveLocation = findViewById(R.id.saveLocation);
        saveLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });
    }
    private void onClickAddImageLocationBtn() {
        buttonAddImageDestination = findViewById(R.id.buttonAddImageDestination);
        buttonAddImageDestination.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

   private  void closeActivity (){
       Intent intent = new Intent(this, MainActivity.class);
       startActivity(intent);
   }

}