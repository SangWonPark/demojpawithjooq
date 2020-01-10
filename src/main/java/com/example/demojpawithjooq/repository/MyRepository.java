package com.example.demojpawithjooq.repository;


import com.example.demojpawithjooq.dto.mySample;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MyRepository extends JpaRepository<mySample, Long> {
}
