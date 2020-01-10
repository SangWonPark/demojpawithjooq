package com.example.demojpawithjooq.repository;

import com.example.demojpawithjooq.dto.hijklmn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface hijklmnRepository extends JpaRepository<hijklmn, Long> {

    @Query(value = "select ex3 from hijklmn")
    List<String> findDistinctByEx3();

}
