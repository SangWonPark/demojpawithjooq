package com.example.demojpawithjooq.dto;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class AtoN {

    @Id
    private int id;
    private String ex1;
    private String ex2;
    private String ex3;
    private String ex4;

}
