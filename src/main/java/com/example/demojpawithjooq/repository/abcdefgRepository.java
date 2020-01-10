package com.example.demojpawithjooq.repository;

import com.example.demojpawithjooq.dto.abcdefg;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface abcdefgRepository extends JpaRepository<abcdefg, Long> {

    List<abcdefg> findAllByEx1IsIn(List<String> in);

    @Query(value = "select h.id, a.ex1, a.ex2, h.ex3, h.ex4 " +
            "from abcdefg a join hijklmn h on a.ex1=h.ex3")
    List<Object> joinAtoN();
}
