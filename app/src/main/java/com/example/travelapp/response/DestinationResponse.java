package com.example.travelapp.response;

import com.example.travelapp.model.Destination;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DestinationResponse {


    @SerializedName("destinations")
    List<Destination>   destinationList ;

    public DestinationResponse(List<Destination> destinationList) {
        this.destinationList = destinationList;
    }

    public List<Destination> getDestinationList() {
        return destinationList;
    }

    public void setDestinationList(List<Destination> destinationList) {
        this.destinationList = destinationList;
    }
}
