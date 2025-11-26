package com.example.api.repository;

import com.example.api.model.enums.TestRunStatus;
import com.example.api.model.TestRun;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface TestRunRepository extends JpaRepository<TestRun, UUID> {
    List<TestRun> findByStatusAndEnvironment(TestRunStatus status, String environment);

    List<TestRun> findByStatus(TestRunStatus status);

    List<TestRun> findByEnvironment(String environment);
}
