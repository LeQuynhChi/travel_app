package com.example.travelapp.model;

import com.google.gson.annotations.SerializedName;

public class Destination {
    @SerializedName("_id")
    private String  id ;
    @SerializedName("name")
    private String name;
    @SerializedName("type")
    private String type;


    @SerializedName("province")
    private String province;
    @SerializedName("district")

    private String district;
    @SerializedName("description")

    private String description;
    @SerializedName("image")

    private String image;

    public Destination(String name, String province, String district, String description, String type, String image) {
        this.name = name;
        this.province = province;
        this.district = district;
        this.description = description;
        this.type = type;
        this.image = image;
    }

    public Destination(String name, String type) {
        this.name = name;
        this.type = type;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
