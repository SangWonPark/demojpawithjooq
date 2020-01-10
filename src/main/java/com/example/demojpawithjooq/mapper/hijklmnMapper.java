package com.example.demojpawithjooq.mapper;

import com.example.demojpawithjooq.dto.AtoN;
import com.example.demojpawithjooq.dto.abcdefg;
import com.example.demojpawithjooq.dto.hijklmn;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface hijklmnMapper {
    hijklmn selectOneB(int id);

    int insertOneB(hijklmn hi);

    int updateOneB(hijklmn hi);

    int deleteOneB(int i);

    List<abcdefg> select();

    List<AtoN> joinAtoN();
}
