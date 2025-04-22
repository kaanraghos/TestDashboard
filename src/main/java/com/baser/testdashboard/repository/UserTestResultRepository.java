package com.baser.testdashboard.repository;

import com.baser.testdashboard.entity.UserTestResult;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserTestResultRepository extends JpaRepository<UserTestResult, Long> {
    List<UserTestResult> findByUserId(Long userId);
}
  