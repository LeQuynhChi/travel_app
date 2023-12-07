package com.example.travelapp.viewModel;


import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.travelapp.model.Destination;
import com.example.travelapp.repository.DestinationRepository;

import java.util.List;

public class DestinationViewModel extends AndroidViewModel {
    private DestinationRepository repo;
    //mutablleLivedata
    public DestinationViewModel(@NonNull Application application) {
        super(application);

    }

    public LiveData<List<Destination.Data>> getAllDestination() {
        return repo.getAllDestination();
    }
}
