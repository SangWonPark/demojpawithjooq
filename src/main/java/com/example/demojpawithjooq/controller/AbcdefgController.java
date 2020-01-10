package com.example.demojpawithjooq.controller;

import com.example.demojpawithjooq.dto.abcdefg;
import com.example.demojpawithjooq.service.AbcdefgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AbcdefgController {

    AbcdefgService abcdefgService;

    @Autowired
    public AbcdefgController(AbcdefgService abcdefgService) {
        this.abcdefgService = abcdefgService;
    }

    @GetMapping("/subQuery")
    public List<abcdefg> subQuery(){
        return abcdefgService.subQuery();
    }

    @GetMapping("/join")
    public List<Object> join() {
        return abcdefgService.joinAtoN();
    }
}
