package com.baser.testdashboard.repository;

import com.baser.testdashboard.entity.Test;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository extends JpaRepository<Test, Long> {
}