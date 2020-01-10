package com.example.demojpawithjooq.controller;

import com.example.demojpawithjooq.dto.AtoN;
import com.example.demojpawithjooq.dto.abcdefg;
import com.example.demojpawithjooq.dto.hijklmn;
import com.example.demojpawithjooq.dto.mySample;
import com.example.demojpawithjooq.service.AbcdefgService;
import com.example.demojpawithjooq.service.HijklmnJOOQService;
import com.example.demojpawithjooq.service.HijklmnJPAService;
import com.example.demojpawithjooq.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@RestController
public class MyController {

    private MyService myService;
    private AbcdefgService abcdefgService;
//    private HijklmnJOOQService hijklmnJooqService;
//    private HijklmnJPAService hijklmnJpaService;

    @Autowired
    public MyController(AbcdefgService abcdefgService, HijklmnJOOQService hijklmnJooqService, MyService myService, HijklmnJPAService hijklmnJpaService) {
        this.myService = myService;
        this.abcdefgService = abcdefgService;
//        this.hijklmnJooqService = hijklmnJooqService;
//        this.hijklmnJpaService = hijklmnJpaService;
    }

    @GetMapping("/cru")
    public mySample create_user() {
        return myService.createUser();
    }

    @GetMapping("/gau")
    public List<mySample> getAllUser() {
        return myService.getAllUser();
    }

    @GetMapping("/cru2")
    public abcdefg create_user2() {
        return abcdefgService.createUser2();
    }

    @GetMapping("/gau2")
    public List<abcdefg> getAllUser2() {
        return abcdefgService.getAllUser2();
    }

    @GetMapping("/gau2-jooq")
    public List<Map<String, Object>> getAllUser2_jooq() {
        return abcdefgService.getAllUser2_jooq();
    }
}
