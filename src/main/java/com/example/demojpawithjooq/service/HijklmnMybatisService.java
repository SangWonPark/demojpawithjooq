package com.example.demojpawithjooq.service;

import com.example.demojpawithjooq.dto.AtoN;
import com.example.demojpawithjooq.dto.abcdefg;
import com.example.demojpawithjooq.dto.hijklmn;

import java.util.List;

public interface HijklmnMybatisService {
    hijklmn selectOneB(int id);

    int insertOneB(hijklmn hi);

    int updateOneB(hijklmn hi);

    int deleteOneB(int i);

    List<abcdefg> select();

    List<AtoN> joinAtoN();
}
