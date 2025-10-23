package org.example.jpa.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;


@Entity
@Data
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer orderId;

    @ManyToOne
    private Customer customer;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "order", orphanRemoval = true)
    private List<OrderItem> items = new ArrayList<>();

    private Double totalValue;

    @Enumerated(EnumType.STRING)
    private OrderStatus status;

    @Enumerated(EnumType.STRING)
    private PaymentMode payment_mode;


    public void addItem(Product product, Integer qty){
        OrderItem item = new OrderItem();
        item.setProduct(product);
        item.setQty(qty);
        item.setOrder(this);
        items.add(item);
    }


}
