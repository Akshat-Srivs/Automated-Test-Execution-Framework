package com.example.worker.dto;

import com.example.worker.model.enums.TestRunStatus;
import lombok.Data;

// This DTO is used to send the *final* update back to the API.
@Data
public class TestRunUpdate {
    private TestRunStatus status;
    private String reportUrl;
    private String errorMessage;
    private String errorDetails;
    private Integer failedTestCount;
    private String screenshotPath;
}