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
import java.util.Arrays;
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
        innitSpinnerDistrict();
        innitSpinnerProvince();
        onClickBackAddLocationArr();
        onClickBackAddLocationBtn();
        onClickAddImageLocationBtn();
        onClickAddLocationBtn();


    }

    public void innitSpinner() {
        spinnerLocationType = findViewById(R.id.spinnerLocationType);
        List<String> spinnerData = new ArrayList<>();
        spinnerData.add("Chùa Dền");
        spinnerData.add("Phong cảnh");
        spinnerData.add("Khu vui chơi");
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, spinnerData);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerLocationType.setAdapter(adapter);

    }
    public void innitSpinnerProvince() {
        spinnerLocationProvince = findViewById(R.id.spinnerLocationProvince);
        List<String> provinceList = Arrays.asList(
                "Hà Nội", "Hồ Chí Minh", "Đà Nẵng", "Hải Phòng", "Quảng Ninh", "Thái Bình",
                "Bắc Ninh", "Hải Dương", "Hà Nam", "Nam Định", "Ninh Bình", "Thanh Hóa",
                "Nghệ An", "Hà Tĩnh", "Quảng Bình", "Quảng Trị", "Thừa Thiên Huế", "Quảng Nam",
                "Quảng Ngãi", "Bình Định", "Phú Yên", "Khánh Hòa", "Ninh Thuận", "Bình Thuận",
                "Kon Tum", "Gia Lai", "Đắk Lắk", "Đắk Nông", "Lâm Đồng", "Bà Rịa - Vũng Tàu",
                "Bình Phước", "Bình Dương", "Đồng Nai", "Tây Ninh", "Long An", "Tiền Giang",
                "Bến Tre", "Trà Vinh", "Vĩnh Long", "Đồng Tháp", "An Giang", "Kiên Giang",
                "Cần Thơ", "Hậu Giang", "Sóc Trăng", "Bạc Liêu", "Cà Mau", "Lào Cai",
                "Yên Bái", "Lạng Sơn", "Quảng Ninh", "Bắc Giang", "Phú Thọ", "Vĩnh Phúc",
                "Bắc Ninh", "Hải Dương", "Hưng Yên", "Thái Bình", "Hà Nam", "Nam Định",
                "Ninh Bình", "Thanh Hóa"
                // Thêm các tỉnh thành khác tương ứng với 64 tỉnh thành Việt Nam
        );

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, provinceList);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerLocationProvince.setAdapter(adapter);

    }


    public void innitSpinnerDistrict() {
        spinnerLocationDistrict = findViewById(R.id.spinnerLocationDistrict);
        List<String> districts = Arrays.asList(
                "Ba Đình", "Hoàn Kiếm", "Hai Bà Trưng", "Đống Đa", "Tây Hồ",
                "Cầu Giấy", "Thanh Xuân", "Hoàng Mai", "Long Biên", "Bắc Từ Liêm",
                "Nam Từ Liêm", "Hà Đông", "Thanh Trì", "Sơn Tây", "Ba Vì",
                "Phúc Thọ", "Thạch Thất", "Quốc Oai", "Chương Mỹ", "Đan Phượng",
                "Hoài Đức", "Thanh Oai", "Mỹ Đức", "Ứng Hòa", "Thường Tín", "Phú Xuyên",
                "Quận 1", "Quận 2", "Quận 3", "Quận 4", "Quận 5", "Quận 6", "Quận 7",
                "Quận 8", "Quận 9", "Quận 10", "Quận 11", "Quận 12", "Bình Tân",
                "Bình Thạnh", "Gò Vấp", "Phú Nhuận", "Tân Bình", "Tân Phú", "Thủ Đức",
                "Bình Chánh", "Cần Giờ", "Củ Chi", "Hóc Môn", "Nhà Bè"
        );
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, districts);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerLocationDistrict.setAdapter(adapter);

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