package com.example.demojpawithjooq.dto;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class abcdefg {

    @Id
    private String ex1;
    private String ex2;

    public String getEx1() {
        return ex1;
    }

    public void setEx1(String ex1) {
        this.ex1 = ex1;
    }

    public String getEx2() {
        return ex2;
    }

    public void setEx2(String ex2) {
        this.ex2 = ex2;
    }
}
