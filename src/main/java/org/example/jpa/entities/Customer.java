package org.example.jpa.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "c_name")
    private String name;

    @Column(name="mob_no")
    private String mobile_no;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "customer")
    List<Address> addresses;
}
