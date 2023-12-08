package com.example.travelapp.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Province {
    @SerializedName("name")
    private  String name;
    @SerializedName("code")
    private  int code;
    @SerializedName("division_type")
    private  String divisionType;

    @SerializedName("phone_code")
    private  int phoneCode;
    @SerializedName("districts")
    private List<String> districts;

    public Province(String name, int code, String divisionType, int phoneCode, List<String> districts) {
        this.name = name;
        this.code = code;
        this.divisionType = divisionType;
        this.phoneCode = phoneCode;
        this.districts = districts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDivisionType() {
        return divisionType;
    }

    public void setDivisionType(String divisionType) {
        this.divisionType = divisionType;
    }

    public int getPhoneCode() {
        return phoneCode;
    }

    public void setPhoneCode(int phoneCode) {
        this.phoneCode = phoneCode;
    }

    public List<String> getDistricts() {
        return districts;
    }

    public void setDistricts(List<String> districts) {
        this.districts = districts;
    }
}

