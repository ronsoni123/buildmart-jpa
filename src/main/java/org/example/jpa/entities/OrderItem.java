package org.example.jpa.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;


    @ManyToOne
    private Product product;

    private Integer qty;

    @ManyToOne
    private Order order;



}
