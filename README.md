# Defense Asset Readiness Management System (DARMS)

## Overview

The **Defense Asset Readiness Management System (DARMS)** is a full-stack enterprise asset management application designed to monitor the operational readiness of military equipment throughout its lifecycle.

Inspired by real-world defense logistics and maintenance operations, DARMS provides a centralized platform for managing individual military assets, tracking inspections, coordinating maintenance activities, and monitoring readiness status through a secure role-based system.

The project emphasizes enterprise software engineering practices, including layered architecture, Agile development, DevOps workflows, automated testing, secure authentication, and comprehensive documentation.

---

# Business Problem

Organizations responsible for maintaining mission-critical equipment require accurate visibility into the operational status of every asset.

Tracking inspections, maintenance activities, transfers, and readiness across numerous assets can become difficult when information is fragmented or maintained through manual processes.

DARMS addresses this challenge by providing a centralized application that enables authorized personnel to:

- Track individual military assets
- Monitor readiness status
- Record inspections
- Manage maintenance activities
- Maintain complete asset lifecycle history
- Improve operational visibility

---

# Project Objectives

The primary objectives of this project are to:

- Build an enterprise-grade Java Spring Boot application
- Demonstrate professional software engineering practices
- Apply Agile development methodologies
- Implement secure role-based authentication and authorization
- Develop a maintainable layered architecture
- Containerize the application using Docker
- Design a normalized PostgreSQL database
- Apply automated testing and validation
- Produce production-quality technical documentation

---

# Core Features

## Authentication & Authorization

- Secure user authentication
- Role-based access control
- Password encryption

---

## Asset Management

- Register military assets
- Update asset information
- View asset details
- Retire assets
- Track asset lifecycle

---

## Inspection Management

- Schedule inspections
- Record inspection results
- View inspection history
- Track inspection status

---

## Maintenance Management

- Schedule maintenance
- Record maintenance activities
- Update maintenance progress
- Return assets to mission-ready status

---

## Asset Tracking

- Current location
- Branch assignment
- Equipment category
- Manufacturer
- Commission date
- Last inspection
- Readiness status

---

## Dashboard

- Mission-ready assets
- Assets under maintenance
- Inspections due
- Assets by branch
- Assets by equipment category

---

# User Roles

### Logistics Manager

Responsible for:

- Managing military assets
- Monitoring readiness
- Approving asset transfers
- Viewing inspections
- Managing maintenance workflows

---

### Maintenance Technician

Responsible for:

- Conducting inspections
- Recording maintenance
- Updating repair progress
- Returning assets to service

---

### System Administrator

Responsible for:

- Managing users
- Managing roles
- System configuration
- Access control

---

# Technology Stack

## Backend

- Java
- Spring Boot
- Spring Security
- Spring Data JPA
- Hibernate
- Maven

## Database

- PostgreSQL

## Frontend

- React
- HTML5
- CSS3
- JavaScript

## DevOps

- Docker
- Docker Compose

## Testing

- JUnit 5

## Documentation

- Swagger / OpenAPI
- Markdown
- Architecture Diagrams

---

# System Architecture

The application follows a layered architecture:

```
Presentation Layer
        │
        ▼
REST Controllers
        │
        ▼
Service Layer
        │
        ▼
Repository Layer
        │
        ▼
PostgreSQL Database
```

---

# Project Documentation

Additional project documentation can be found in the `/docs` directory.

| Document | Description |
|----------|-------------|
| BusinessRequirements.md | Business requirements document |
| UserStories.md | Agile user stories |
| Architecture.md | System architecture |
| DatabaseDesign.md | Entity relationship design |

---

# Getting Started

## Prerequisites

- Java 21+
- Maven
- Docker
- Docker Compose
- PostgreSQL (optional if using Docker)

---

## Clone the Repository

```bash
git clone https://github.com/yourusername/Defense-Asset-Readiness-Management-System-DARMS-.git

cd Defense-Asset-Readiness-Management-System-DARMS-
```

---

## Run with Docker

```bash
docker compose up --build
```

---

## Run Locally

```bash
mvn spring-boot:run
```

---

# Project Status

Currently under active development.

Development follows an Agile sprint-based workflow with incremental feature delivery.

---

# Possible Future Enhancements

- Advanced analytics dashboard
- Asset maintenance forecasting
- Email notifications
- PDF report generation
- Multi-installation support
- Enhanced audit reporting
- CI/CD pipeline
- Cloud deployment

---

# Learning Objectives

This project is intended to demonstrate:

- Enterprise Java development
- Spring Boot best practices
- Secure REST API development
- PostgreSQL database design
- Docker containerization
- Agile software development
- DevOps principles
- Unit and integration testing
- Professional software documentation

---

# Disclaimer

DARMS is an educational portfolio project inspired by enterprise asset management concepts used within large organizations. It is not affiliated with or endorsed by the United States Department of Defense or any government agency and does not contain or process classified information.
