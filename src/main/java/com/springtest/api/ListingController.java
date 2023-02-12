package com.springtest.api;


import com.springtest.models.Listing;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/listings")
public class ListingController {

    private final ListingService listingService;
    @GetMapping
    public List<Listing> fetchAllListings(){
        return listingService.getAllListings();
    }

    public ListingController(ListingService listingService) {
        this.listingService = listingService;
    }
}
