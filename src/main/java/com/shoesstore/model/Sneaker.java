package com.shoesstore.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "sneakers")
public class Sneaker {
    @Id
    private String sneakerId;

    private String name;

    private String description;

    private double marketValue;

    private String imageUrl;

    private String resellLink;

}
