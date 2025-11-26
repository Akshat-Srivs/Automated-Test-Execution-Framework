package com.example.worker.dto;

import com.example.worker.model.enums.TestRunStatus;
import lombok.Data;
import java.time.LocalDateTime;

@Data
public class TestResult {
    private TestRunStatus status;
    private String reportUrl;
    private String errorMessage;
    private Integer failedTestCount = 0;
    private String screenshotPath;
    private String testType;
    private String testUrl;
    private String testParameters;
    private String testDescription;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Long durationMs;
}