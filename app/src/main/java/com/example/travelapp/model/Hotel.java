package com.example.travelapp.model;

public class Hotel {

    private String name;
    private String province;
    private String district;
    private String description;
    private String type;
    private String image;
    private int rate;

    public Hotel(String name, String province, String district, String description, String type, String image) {
        this.name = name;
        this.province = province;
        this.district = district;
        this.description = description;
        this.type = type;
        this.image = image;
        this.rate = 0;
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

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
}
