package com.example.demojpawithjooq.repository;

import com.example.demojpawithjooq.dto.AtoN;
import com.example.demojpawithjooq.dto.abcdefg;
import com.example.demojpawithjooq.dto.hijklmn;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

import static org.jooq.impl.DSL.*;//sql query문에 들어갈 table field 등의 값을 설정할 때 필요

@Repository
public class hijklmnJooq {

    private final DSLContext create;
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public hijklmnJooq(DSLContext dslContext, JdbcTemplate jdbcTemplate) {
        this.create = dslContext;
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Map<String, Object>> searchId(String ex3) {
        String sql = create.selectFrom("hijklmn")
                .where(field("hijklmn.ex3").eq(ex3))
                .orderBy(field("hijklmn.id").desc())
                .getSQL();
        return jdbcTemplate.queryForList(sql);
    }

    public int insert(hijklmn hi) throws Exception {
        return create.insertInto(table("hijklmn"))
                .values(hi.getId(), hi.getEx3(), hi.getEx4())
                .execute();
//        return create.insertInto(table("hijklmn"))
//                .values(10, "sangwonpark", "park")
//                .execute();
    }

    public List<hijklmn> selectOne(int id) {
        return create.selectFrom(table("hijklmn"))
                .where(field("hijklmn.id").eq(id))
                .fetchInto(hijklmn.class);
    }

    public int update(hijklmn hi) throws Exception {
        return create.update(table("hijklmn"))
                .set(field("hijklmn.ex3"), hi.getEx3())
                .set(field("hijklmn.ex4"), hi.getEx4())
                .where(field("hijklmn.id").eq(hi.getId()))
                .execute();
//        return create.update(table("hijklmn"))
//                .set(field("hijklmn.ex3"), "asd")
//                .set(field("hijklmn.ex4"), "intellij")
//                .where(field("hijklmn.id").eq(10))
//                .execute();
    }

    public int delete(int id) {
        return create.delete(table("hijklmn"))
                .where(field("hijklmn.id").eq(id))
                .execute();
//        return create.delete(table("hijklmn"))
//                .where(field("hijklmn.id").eq(10))
//                .execute();
    }

    public List<Map<String, Object>> joinAtoN() {
        String sql = create.select()
                .from(table("abcdefg"))
                .join(table("hijklmn"))
                .on(field("abcdefg.ex1").eq(field("hijklmn.ex3")))
                .getSQL();
        return jdbcTemplate.queryForList(sql);
    }

    public List<Map<String, Object>> leftOuterJoinAtoN() {
        String sql = create.select()
                .from(table("abcdefg"))
                .leftJoin(table("hijklmn"))
                .on(field("abcdefg.ex1").eq(field("hijklmn.ex3")))
                .getSQL();
        return jdbcTemplate.queryForList(sql);
    }

    public List<Map<String, Object>> rightOuterJoinAtoN() {
        String sql = create.select()
                .from(table("abcdefg"))
                .rightJoin(table("hijklmn"))
                .on(field("abcdefg.ex1").eq(field("hijklmn.ex3")))
                .getSQL();
        return jdbcTemplate.queryForList(sql);
    }

    public List<AtoN> joinAtoN2() {
        return create.select()
                .from(table("abcdefg"))
                .join(table("hijklmn"))
                .on(field("abcdefg.ex1").eq(field("hijklmn.ex3")))
                .fetchInto(AtoN.class);
    }

    public List<abcdefg> select() {
        return create.select(field("abcdefg.ex1"), field("abcdefg.ex2"))
                .from(table("abcdefg"))
                .where(field("abcdefg.ex1").in(create
                        .select(field("hijklmn.ex3"))
                        .from(table("hijklmn"))
                ))
                .orderBy(field("abcdefg.ex1").desc())
                .fetchInto(abcdefg.class);
    }
}