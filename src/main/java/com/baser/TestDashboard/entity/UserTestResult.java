package com.baser.TestDashboard.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserTestResult {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime completedAt;
    private double score;

    @ManyToOne
    private User user;

    @ManyToOne
    private Test test;

    @OneToMany(mappedBy = "userTestResult", cascade = CascadeType.ALL)
    private List<UserAnswer> answers;
}