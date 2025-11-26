package com.example.api.dto;

import com.example.api.model.enums.TestRunStatus;
import com.example.api.model.TestRun;
import lombok.Data;

/**
 * This DTO receives the *result* of a test run from the worker.
 */
@Data
public class TestRunUpdate {
    private TestRunStatus status;
    private String reportUrl;
    private String errorMessage;
    private String errorDetails;
    private Integer failedTestCount;
    private String screenshotPath;
}