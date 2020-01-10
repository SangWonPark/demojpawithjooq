package com.example.demojpawithjooq.service;

import com.example.demojpawithjooq.dto.abcdefg;
import com.example.demojpawithjooq.repository.abcdefgJooq;
import com.example.demojpawithjooq.repository.abcdefgRepository;
import com.example.demojpawithjooq.repository.hijklmnRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

@Service
public class AbcdefgService {

    private abcdefgRepository abcdefgRepository;
    private abcdefgJooq abcdefgJooq;

    private hijklmnRepository hijklmnRepository;

    @Autowired
    public AbcdefgService(abcdefgRepository abcdefgRepository, abcdefgJooq abcdefgJooq, hijklmnRepository hijklmnRepository) {
        this.abcdefgRepository = abcdefgRepository;
        this.abcdefgJooq = abcdefgJooq;
        this.hijklmnRepository = hijklmnRepository;
    }

    public abcdefg createUser2() {
        Scanner sc = new Scanner(System.in);
        abcdefg abc = new abcdefg();
        System.out.print("1st parameter : ");
        abc.setEx1(sc.nextLine());
        System.out.print("2nd parameter : ");
        abc.setEx2(sc.nextLine());
        return abcdefgRepository.save(abc);
    }

    public List<abcdefg> getAllUser2() {
        return abcdefgRepository.findAll();
    }

    public List<Map<String, Object>> getAllUser2_jooq() {
        return abcdefgJooq.getAllUserJooq();
    }

    public List<abcdefg> subQuery() {
        return abcdefgRepository.findAllByEx1IsIn(hijklmnRepository.findDistinctByEx3());
    }

    public List<Object> joinAtoN() {
        return abcdefgRepository.joinAtoN();
    }
}
