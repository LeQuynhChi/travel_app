package com.example.travelapp.view;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.example.travelapp.R;
import com.example.travelapp.model.Destination;
import com.example.travelapp.adapter.DestinationAdapter;
import com.google.android.material.navigation.NavigationView;

import java.util.List;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    ImageView btn_location,btn_restaurant,btn_hotel;
    DrawerLayout drawer_layout;
    NavigationView navigation_view;
    Toolbar toolbar;
    FrameLayout content_frame;
    private DestinationAdapter destinationAdapter;
    private List<Destination> mdestinationList;

    private static final int FRAGMENT_HOME = 0;
    private static final int FRAGMENT_LOCATION = 1;
    private static final int FRAGMENT_RESTAURANT = 2;
    private static final int FRAGMENT_HOTEL= 3;
    private int currentFragment = FRAGMENT_LOCATION;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        setNavigattionBar();

        // đổi màu cho các icon mỗi khi click vào
        btn_hotel.setColorFilter(R.color.deep_sky_blue);
        btn_restaurant.setColorFilter(R.color.deep_sky_blue);
        btn_location.setColorFilter(R.color.white);
//        btn_hotel.setColorFilter(ContextCompat.getColor(this, android.R.color.deep_sky_blue),
//                PorterDuff.Mode.MULTIPLY);
//        btn_restaurant.setColorFilter(ContextCompat.getColor(this, android.R.color.white),
//                PorterDuff.Mode.MULTIPLY);
//        btn_location.setColorFilter(ContextCompat.getColor(this, android.R.color.white),
//                PorterDuff.Mode.MULTIPLY);
        onClickLocation();
        onClickHotel();
        onClickRestaurant();

        // bắt sự kiện khi click các item trong navigationBar_menu
        navigation_view.setNavigationItemSelectedListener(this);
    }


    private void onClickRestaurant() {
        btn_hotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { setClickColor(view);
            }
        });
    }

    private void onClickHotel() {
        btn_restaurant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setClickColor(view);
            }
        });
    }

    private void onClickLocation() {
        btn_location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setClickColor(view);
            }
        });
    }

    private void setClickColor( View v) {
        if ( v == btn_location) {
            btn_hotel.setColorFilter(R.color.deep_sky_blue);
            btn_restaurant.setColorFilter(R.color.deep_sky_blue);
            btn_location.setColorFilter(R.color.white);
        } else if ( v == btn_hotel) {
            btn_location.setColorFilter(R.color.deep_sky_blue);
            btn_restaurant.setColorFilter(R.color.deep_sky_blue);
            btn_hotel.setColorFilter(R.color.white);
        } else if ( v == btn_restaurant) {
            btn_location.setColorFilter(R.color.deep_sky_blue);
            btn_hotel.setColorFilter(R.color.deep_sky_blue);
            btn_restaurant.setColorFilter(R.color.white);
        }
    }

    private void setNavigattionBar() {
        setSupportActionBar(toolbar);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer_layout, toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer_layout.addDrawerListener(toggle);
        toggle.syncState();

        navigation_view.setNavigationItemSelectedListener(this);

        replaceFragment(new HomeFragment());
        navigation_view.getMenu().findItem(R.id.nav_home).setChecked(true);
    }
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.nav_home) {
            if (currentFragment != FRAGMENT_HOME) {
                replaceFragment(new HomeFragment());
                currentFragment = FRAGMENT_HOME;
            }
        } else if (id == R.id.nav_location) {
            if (currentFragment != FRAGMENT_LOCATION){
                replaceFragment(new LocationFragment());
                currentFragment = FRAGMENT_LOCATION;
            }
        } else if (id == R.id.nav_restaurant) {
            if (currentFragment != FRAGMENT_RESTAURANT){
                replaceFragment(new RestaurantFragment());
                currentFragment = FRAGMENT_RESTAURANT;
            }
        } else if (id == R.id.nav_hotel) {
            if (currentFragment != FRAGMENT_HOTEL){
                replaceFragment(new HotelFragment());
                currentFragment = FRAGMENT_HOTEL;
            }
        }

        drawer_layout.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onBackPressed() {
        // kiểm tra đã thoát app hay chưa
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    private void replaceFragment(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.content_frame,fragment);
        transaction.commit();
    }

    private void init() {
        btn_location = findViewById(R.id.btn_location);
        btn_hotel = findViewById(R.id.btn_hotel);
        btn_restaurant = findViewById(R.id.btn_restaurant);
        drawer_layout = findViewById(R.id.drawer_layout);
        toolbar = findViewById(R.id.toolbar);
        navigation_view = findViewById(R.id.navigation_view);
        content_frame = findViewById(R.id.content_frame);
    }
}