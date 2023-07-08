package com.shoesstore.service;

import com.shoesstore.model.Sneaker;
import com.shoesstore.model.UserPortfolio;
import com.shoesstore.model.User;
import com.shoesstore.repository.UserPortfolioRepository;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class UserPortfolioService {
    private final UserPortfolioRepository userPortfolioRepository;

    public UserPortfolioService(UserPortfolioRepository userPortfolioRepository) {
        this.userPortfolioRepository = userPortfolioRepository;
    }

    public UserPortfolio createUserPortfolio(User user, Sneaker sneaker, Date acquisitionDate, double purchasePrice) {
        UserPortfolio userPortfolio = new UserPortfolio();
        userPortfolio.setUser(user);
        userPortfolio.setSneaker(sneaker);
        userPortfolio.setAcquisitionDate(acquisitionDate);
        userPortfolio.setPurchasePrice(purchasePrice);

        return userPortfolioRepository.save(userPortfolio);
    }
}
