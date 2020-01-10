package com.example.demojpawithjooq.service.impl;

import com.example.demojpawithjooq.dto.AtoN;
import com.example.demojpawithjooq.dto.abcdefg;
import com.example.demojpawithjooq.dto.hijklmn;
import com.example.demojpawithjooq.mapper.hijklmnMapper;
import com.example.demojpawithjooq.service.HijklmnMybatisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HijklmnMybatisServiceImpl  implements HijklmnMybatisService {

    private hijklmnMapper service;

    @Autowired
    public HijklmnMybatisServiceImpl(hijklmnMapper service) {
        this.service = service;
    }

    @Override
    public int insertOneB(hijklmn hi) {
        return service.insertOneB(hi);
    }

    @Override
    public hijklmn selectOneB(int id) {
        return service.selectOneB(id);
    }

    @Override
    public int updateOneB(hijklmn hi) {
        return service.updateOneB(hi);
    }

    @Override
    public int deleteOneB(int id) {
        return service.deleteOneB(id);
    }

    @Override
    public List<abcdefg> select() {
        return service.select();
    }

    @Override
    public List<AtoN> joinAtoN() {
        return service.joinAtoN();
    }
}
