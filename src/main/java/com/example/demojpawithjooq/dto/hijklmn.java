package com.example.demojpawithjooq.dto;

import javax.persistence.*;


@Entity
public class hijklmn {

    @Id
    private int id;

    @Column
    private String ex3;
    @Column
    private String ex4;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEx3() {
        return ex3;
    }

    public void setEx3(String ex3) {
        this.ex3 = ex3;
    }

    public String getEx4() {
        return ex4;
    }

    public void setEx4(String ex4) {
        this.ex4 = ex4;
    }
}
