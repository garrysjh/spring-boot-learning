package com.springtest.api.listings;

import com.springtest.models.Listing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ListingService {
@Autowired
    private final ListingRepository listingRepository;
    public List<Listing> getAllListings(){
        return listingRepository.findAll();
    }

    public ListingService(ListingRepository listingRepository) {
        this.listingRepository = listingRepository;
    }
}
