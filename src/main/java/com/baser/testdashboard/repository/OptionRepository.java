package com.baser.testdashboard.repository;

import com.baser.testdashboard.entity.Option;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OptionRepository extends JpaRepository<Option, Long> {
}