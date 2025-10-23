package org.example.jpa.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer productId;

    private String productName;

    private Double price;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
}
