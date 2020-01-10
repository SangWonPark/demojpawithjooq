package com.example.demojpawithjooq.controller;

import com.example.demojpawithjooq.dto.hijklmn;
import com.example.demojpawithjooq.service.HijklmnJPAService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HijklmnJpaController {

    private HijklmnJPAService hijklmnJpaService;

    @Autowired
    public HijklmnJpaController(HijklmnJPAService hijklmnJpaService) {
        this.hijklmnJpaService = hijklmnJpaService;
    }

    //JPA
    @GetMapping("/selectOnep")
    public hijklmn selectOneJpa(long id) {
        return hijklmnJpaService.selectOneJpa(id);
    }

    @GetMapping("/insertOnep")
    public hijklmn insertJpa() {
        return hijklmnJpaService.insertJpa();
    }

    @PutMapping("/updateOnep")
    public hijklmn updateOne(hijklmn hi) {
        return hijklmnJpaService.updateJpa(hi);
    }

    @DeleteMapping("/deleteOnep")
    public String deleteOne(@RequestParam long id) {
        try {
            hijklmnJpaService.deleteJpa(id);
        } catch (Exception e) {
            return e.toString();
        }
        return "delete";
    }
    //JPA End

    @GetMapping("/sub")
    public List<String> sub() {
        return hijklmnJpaService.selectEx3();
    }
}
