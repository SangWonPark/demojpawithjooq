package com.example.demojpawithjooq.service;

import com.example.demojpawithjooq.dto.AtoN;
import com.example.demojpawithjooq.dto.hijklmn;
import com.example.demojpawithjooq.repository.hijklmnJooq;
import com.example.demojpawithjooq.repository.hijklmnRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

@Service
public class HijklmnJOOQService {

    private Scanner sc;
    private hijklmnJooq hijklmnJooq;
    private hijklmnRepository hijklmnRepository;

    @Autowired
    public HijklmnJOOQService(hijklmnJooq hijklmnJooq, hijklmnRepository hijklmnRepository) {
        this.sc = new Scanner(System.in);
        this.hijklmnJooq = hijklmnJooq;
        this.hijklmnRepository = hijklmnRepository;
    }

    //jOOQ
    public List<hijklmn> selectOne() {
        return hijklmnJooq.selectOne(14);
    }

    public int insert() throws Exception {
        hijklmn hi = new hijklmn();
        System.out.print("id :");
        hi.setId(sc.nextInt());
        sc.nextLine();
        System.out.print("ex3 parameter : ");
        hi.setEx3(sc.nextLine());
        System.out.print("ex4 parameter : ");
        hi.setEx4(sc.nextLine());

        return hijklmnJooq.insert(hi);
    }

    public int update(hijklmn hi) throws Exception {
        return hijklmnJooq.update(hi);
    }

    public int update() throws Exception {
        hijklmn hi = new hijklmn();
        System.out.print("id :");
        hi.setId(sc.nextInt());
        sc.nextLine();
        System.out.print("ex3 parameter : ");
        hi.setEx3(sc.nextLine());
        System.out.print("ex4 parameter : ");
        hi.setEx4(sc.nextLine());

        return hijklmnJooq.update(hi);
    }

    public int delete() throws Exception {
        System.out.print("id :");
        return hijklmnJooq.delete(sc.nextInt());
    }
    //jOOQ CRUD End

    public List<Map<String, Object>> getAllTableE() {
        return hijklmnJooq.joinAtoN();
    }

    public List<Map<String, Object>> getAllTableELeft() {
        return hijklmnJooq.leftOuterJoinAtoN();
    }

    public List<Map<String, Object>> getAllTableERight() {
        return hijklmnJooq.rightOuterJoinAtoN();
    }

    public List<AtoN> getJoinTable() {
        return hijklmnJooq.joinAtoN2();
    }
}
