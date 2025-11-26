
# Automated Regression Test Suite Framework

A fully scalable **end-to-end automated regression testing framework** designed using **Java 17**, **Spring Boot**, **RabbitMQ**, **Selenium**, and **REST-Assured**.  
The framework supports **parallel test execution**, **asynchronous job processing**, **real-time reporting**, **HTML/CSV/JUnit reports**, and **Dockerized multi-service environment** for seamless distributed test execution.

---

## 🚀 Features

- Automated UI Testing (Selenium WebDriver)
- API Testing (REST-Assured)
- Parallel multithreaded execution
- Spring Boot API for scheduling and execution control
- Worker service for async test execution via RabbitMQ
- MySQL persistence for test runs
- HTML / CSV / JUnit reports + screenshots
- Docker Compose support
- Optional dashboard with real-time status

---

## 🛠️ Tech Stack

### Core
- Java 21
- Spring Boot 3.2.5
- Maven

### Testing
- Selenium WebDriver
- REST-Assured
- JUnit 5

### Messaging & Database
- RabbitMQ
- MySQL 8.0
- Spring Data JPA (Hibernate)

### Dashboard (Optional)
- HTML5, CSS3
- Vanilla JavaScript
- Nginx

### DevOps
- Docker
- Docker Compose
- Selenium Grid

### Reporting
- Thymeleaf
- Allure Reports

---

## 📦 Modules

| Module | Description |
|--------|------------|
| Test Management API | REST API to schedule and manage test runs |
| Test Runner Worker | Executes Selenium/API tests pulled from RabbitMQ |
| Reporting Module | Generates HTML/CSV/JUnit reports |
| Messaging Layer | Handles RabbitMQ queues, routing, retries |
| Database Layer | MySQL storage for runs, logs, reports |
| Dashboard | UI for viewing runs (optional) |

---

## 🧩 Key Classes

| Class | Responsibility |
|--------|--------------|
| TestRunController | Exposes run scheduling and query APIs |
| TestRunService | Core logic for execution lifecycle |
| TestRunRepository | CRUD operations on run data |
| WorkerListener | RabbitMQ consumer |
| TestExecutor | Runs Selenium/API tests |
| ReportGenerator | Builds test reports |
| DatabaseManager | Handles DB interactions |

---

## 📌 Product Backlog

| ID | Story | Priority |
|----|--------|----------|
| PB1 | Start test runs via API | High |
| PB2 | Worker executes tests | High |
| PB3 | Parallel execution | High |
| PB4 | Reporting engine | High |
| PB5 | DB persistence | Medium |
| PB6 | Dashboard UI | Medium |
| PB7 | Retry mechanism | Medium |
| PB8 | Tag filtering | Medium |
| PB9 | Docker Compose | Medium |


## 🏁 Outcomes

- Faster regression cycles  
- Fully automated scheduling  
- Comprehensive reporting  
- Scalable distributed execution  
- CI/CD‑ready architecture  

---

---
## Author
Akshat Prakash Srivastava
---



