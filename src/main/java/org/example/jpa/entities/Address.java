package org.example.jpa.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer addressId;
    String addressLine1;
    String addressLine2;
    String pincode;
    String city;


    @ManyToOne
    @JoinColumn(name = "customer_id")
    Customer customer;



}
