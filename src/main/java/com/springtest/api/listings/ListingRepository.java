package com.springtest.api.listings;

import com.springtest.models.Listing;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface ListingRepository extends MongoRepository<Listing, String> {
}
