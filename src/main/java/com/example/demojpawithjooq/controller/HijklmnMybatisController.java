package com.example.demojpawithjooq.controller;

import com.example.demojpawithjooq.dto.AtoN;
import com.example.demojpawithjooq.dto.abcdefg;
import com.example.demojpawithjooq.dto.hijklmn;
import com.example.demojpawithjooq.service.HijklmnMybatisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HijklmnMybatisController {

    private HijklmnMybatisService MybatisService;

    @Autowired
    public HijklmnMybatisController(HijklmnMybatisService mybatisService) {
        MybatisService = mybatisService;
    }

    @GetMapping("/insertOneB")
    public int insertOneB() {
        hijklmn hi = new hijklmn();
        hi.setId(10);
        hi.setEx3("sangwonpark");
        hi.setEx4("park");
        return MybatisService.insertOneB(hi);
    }

    @GetMapping("/selectOneB")
    public hijklmn selectOneB() {
        return MybatisService.selectOneB(10);
    }

    @PutMapping("/updateOneB")
    public int updateOneB() {
        hijklmn hi = new hijklmn();
        hi.setId(10);
        hi.setEx3("sangwonpark");
        hi.setEx4("park");
        return MybatisService.updateOneB(hi);
    }

    @GetMapping("/deleteOneB")
    public int deleteOneB() {
        return MybatisService.deleteOneB(10);
    }

    @GetMapping("/select")
    public List<abcdefg> select() {
        return MybatisService.select();
    }

    @GetMapping("/joinAtoNB")
    public List<AtoN> joinAtoNB() {
        return MybatisService.joinAtoN();
    }
}
