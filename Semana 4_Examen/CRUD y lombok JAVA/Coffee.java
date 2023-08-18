package com.luv2code.springboot.cruddemo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="coffee")
public class Coffee {

    // define fields
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="milk")
    private String milk;

    @Column(name="price")
    private String price;

    @Column(name="size")
    private String size;


    // define constructors
    public Coffee() {

    }

    public Coffee(String milk, String price, String size) {
        this.milk = milk;
        this.price = price;
        this.size = size;
    }
}








