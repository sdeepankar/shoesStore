package com.shoesstore.repository;
import com.shoesstore.model.Sneaker;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SneakerRepository extends MongoRepository<Sneaker, String> {
    // Additional custom queries can be added here if needed
}
