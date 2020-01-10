package com.example.demojpawithjooq.repository;

import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

import static org.jooq.impl.DSL.*;//sql query문에 들어갈 table field 등의 값을 설정할 때 필요

@Repository
public class abcdefgJooq {

    private final DSLContext create;
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public abcdefgJooq(DSLContext create, JdbcTemplate jdbcTemplate) {
        this.create = create;
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Map<String, Object>> getAllUserJooq(){
        return jdbcTemplate.queryForList(
                create.select()
                        .from(table("abcdefg"))
                        .getSQL()
        );
    }
}
