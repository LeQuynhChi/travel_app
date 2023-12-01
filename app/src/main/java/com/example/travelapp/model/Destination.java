package com.example.travelapp.model;

public class Destination {
    private String destination_name;
    private String domain;
    private String province;
    private String district;
    private String description;
    private String type;
    private String image;

    public Destination(String destination_name, String domain, String province, String district,
                       String description, String type, String image) {
        this.destination_name = destination_name;
        this.domain = domain;
        this.province = province;
        this.district = district;
        this.description = description;
        this.type = type;
        this.image = image;
    }

    public String getLocation() {
        return district +","+province;
    }

    public String getDestination_name() {
        return destination_name;
    }

    public void setDestination_name(String destination_name) {
        this.destination_name = destination_name;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
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
