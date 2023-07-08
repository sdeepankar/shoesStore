package com.shoesstore.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
@Data
@Document(collection = "users")
public class User {
    @Id
    private String userId;

    private String firstName;

    private String lastName;

    private String email;

    private String passwordHash;

    private Date dateCreated;

}
