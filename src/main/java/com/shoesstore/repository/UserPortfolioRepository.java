package com.shoesstore.repository;
import com.shoesstore.model.UserPortfolio;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserPortfolioRepository extends MongoRepository<UserPortfolio, String> {
    // Additional custom queries can be added here if needed
}
