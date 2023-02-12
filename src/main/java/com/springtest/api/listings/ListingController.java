package com.springtest.api.listings;


import com.springtest.models.Listing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ListingController {
@Autowired
    private final ListingService listingService;
    @GetMapping("/listings")
    public List<Listing> fetchAllListings(){
        return listingService.getAllListings();
    }
    @GetMapping("/test")
    public List<Listing> index() {
        return listingService.getAllListings();
    }

    public ListingController(ListingService listingService) {
        this.listingService = listingService;
    }
}
