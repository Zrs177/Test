package com.example.demo3.bean;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class Book {
    private Integer id;
    private String name;
    private Double price;
    private String author;
    private Integer sales;
    private Integer stock;
}
