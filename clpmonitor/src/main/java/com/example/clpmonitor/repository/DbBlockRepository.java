package com.example.clpmonitor.repository;

import com.example.clpmonitor.model.DbBlock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DbBlockRepository extends JpaRepository<DbBlock, Long> {
}