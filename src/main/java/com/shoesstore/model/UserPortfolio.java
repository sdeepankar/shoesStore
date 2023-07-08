package com.shoesstore.model;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
@Data
@Document(collection = "userPortfolio")
public class UserPortfolio {
    @Id
    private String id;

    @DBRef
    private User user;

    @DBRef
    private Sneaker sneaker;

    private Date acquisitionDate;

    private double purchasePrice;

}
