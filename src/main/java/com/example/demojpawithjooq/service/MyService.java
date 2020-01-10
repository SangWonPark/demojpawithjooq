package com.example.demojpawithjooq.service;

import com.example.demojpawithjooq.dto.mySample;
import com.example.demojpawithjooq.repository.MyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Scanner;

@Service
public class MyService {

    private Scanner sc;
    private MyRepository myRepository;

    @Autowired
    public MyService(MyRepository myRepository){
        this.myRepository = myRepository;
        this.sc = new Scanner(System.in);
    }

    public mySample createUser() {
        mySample ma = new mySample();
        ma.setId(sc.nextLine());
        ma.setName(sc.nextLine());
        ma.setPwd(sc.nextLine());
        return myRepository.save(ma);
    }

    public List<mySample> getAllUser(){
        return myRepository.findAll();
    }
}
