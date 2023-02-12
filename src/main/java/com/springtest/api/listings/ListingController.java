package com.springtest.api.listings;


import com.springtest.models.Listing;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/listings")
public class ListingController {

    private final ListingService listingService;
    @GetMapping("/listings")
    public List<Listing> fetchAllListings(){
        return listingService.getAllListings();
    }

    public ListingController(ListingService listingService) {
        this.listingService = listingService;
    }
}
