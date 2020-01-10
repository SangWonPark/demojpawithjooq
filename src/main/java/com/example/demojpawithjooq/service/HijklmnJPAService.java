package com.example.demojpawithjooq.service;

import com.example.demojpawithjooq.dto.abcdefg;
import com.example.demojpawithjooq.dto.hijklmn;
import com.example.demojpawithjooq.repository.abcdefgRepository;
import com.example.demojpawithjooq.repository.hijklmnJooq;
import com.example.demojpawithjooq.repository.hijklmnRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Service
public class HijklmnJPAService {

    private hijklmnRepository hijklmnRepository;
    private abcdefgRepository abcdefgRepository;

    @Autowired
    public HijklmnJPAService(hijklmnRepository hijklmnRepository, abcdefgRepository abcdefgRepository) {
        this.hijklmnRepository = hijklmnRepository;
        this.abcdefgRepository = abcdefgRepository;
    }

    //JPA
    public hijklmn insertJpa() {
        hijklmn hi = new hijklmn();
        hi.setId(16);
        hi.setEx3("sangwonpark");
        hi.setEx4("temp");
        return hijklmnRepository.save(hi);
    }

    public hijklmn selectOneJpa(long id) {
        return hijklmnRepository.findById(id).get();
    }

    public hijklmn updateJpa(hijklmn hi) {
        return hijklmnRepository.save(hi);
    }

    public void deleteJpa(long id) throws Exception {
        hijklmnRepository.deleteById(id);
    }
    //JPA CRUD End

    public List<abcdefg> select() {
        List<hijklmn> subquery = hijklmnRepository.findAll();
        List<abcdefg> output = new ArrayList<abcdefg>();

        for (hijklmn hi : subquery)
            output.add(abcdefgRepository.findById((long)hi.getId()).get());

        return abcdefgRepository.findAll();
    }

    public List<String> selectEx3() {
        return hijklmnRepository.findDistinctByEx3();
    }
}
