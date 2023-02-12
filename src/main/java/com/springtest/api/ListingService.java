package com.springtest.api;

import com.springtest.models.Listing;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ListingService {

    private final ListingRepository listingRepository;
    public List<Listing> getAllListings(){
        return listingRepository.findAll();
    }

    public ListingService(ListingRepository listingRepository) {
        this.listingRepository = listingRepository;
    }
}
