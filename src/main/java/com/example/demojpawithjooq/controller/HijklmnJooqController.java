package com.example.demojpawithjooq.controller;

import com.example.demojpawithjooq.dto.AtoN;
import com.example.demojpawithjooq.dto.hijklmn;
import com.example.demojpawithjooq.service.HijklmnJOOQService;
import org.jooq.Record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class HijklmnJooqController {

    private HijklmnJOOQService hijklmnJooqService;

    @Autowired
    public HijklmnJooqController(HijklmnJOOQService hijklmnJooqService) {
        this.hijklmnJooqService = hijklmnJooqService;
    }


    //jOOQ
    @GetMapping("/selectOneq")
    public List<hijklmn> selectOne() {
        return hijklmnJooqService.selectOne();
    }

    @GetMapping("/insertOneq")
    public String create_user3() {
        try {
            hijklmnJooqService.insert();
        } catch (DataIntegrityViolationException e) {
            return "참조하려는 값이 abcdrfg 테이블에 없습니다.";
        } catch (Exception e) {
            return e.toString();
        }
        return "사용자 등록 완료";
    }

    @PutMapping("/updateOneq")
    public String update_user3(@RequestBody hijklmn hi) {
        try {
            hijklmnJooqService.update(hi);
        } catch (Exception e) {
            return e.toString();
        }
        return "사용자 정보 수정 완료";
    }

    @GetMapping("/deleteOneq")
    public String delete_user3() {
        try {
            hijklmnJooqService.delete();
        } catch (Exception e) {
            return e.toString();
        }
        return "사용자 정보 삭제 완료";
    }
    //jOOQ End


    @GetMapping("/joinAtoN")
    public List<Map<String, Object>> joinAtoN() {
        return hijklmnJooqService.getAllTableE();
    }

    @GetMapping("/joinAtoNL")
    public List<Map<String, Object>> joinAtoNL() {
        return hijklmnJooqService.getAllTableELeft();
    }

    @GetMapping("/joinAtoNR")
    public List<Map<String, Object>> joinAtoNR() {
        return hijklmnJooqService.getAllTableERight();
    }

    @GetMapping("/joinAtoN2")
    public List<AtoN> joinAtoN2() {
        return hijklmnJooqService.getJoinTable();
    }
}
