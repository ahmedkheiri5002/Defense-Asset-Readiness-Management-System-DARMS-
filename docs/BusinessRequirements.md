# Business Requirements Document (BRD)

# Defense Asset Readiness Management System (DARMS)

---

## Version

**Version:** 1.0

**Project Type:** Enterprise Full-Stack Web Application

**Prepared By:** Ahmed

---

# 1. Introduction

The Defense Asset Readiness Management System (DARMS) is an enterprise web application designed to assist organizations responsible for maintaining military equipment throughout its operational lifecycle.

The application provides a centralized platform for monitoring asset readiness, scheduling inspections, recording maintenance activities, and managing equipment information through secure role-based access.

This project is intended to demonstrate enterprise software engineering principles including Agile development, layered architecture, secure application design, testing, DevOps practices, and technical documentation.

---

# 2. Business Problem

Organizations responsible for maintaining mission-critical military equipment require an accurate understanding of asset readiness at any given time.

Managing inspections, maintenance activities, and operational status becomes increasingly difficult as the number of assets grows. Manual tracking methods or disconnected systems may reduce visibility into which assets are ready for service and which require maintenance.

The organization requires a centralized application capable of tracking the complete lifecycle of individual military assets while allowing authorized personnel to efficiently monitor readiness and maintenance activities.

---

# 3. Business Objectives

The objectives of DARMS are to:

- Centralize military asset information.
- Improve visibility into equipment readiness.
- Simplify inspection management.
- Simplify maintenance workflows.
- Track the complete lifecycle of military assets.
- Improve data accuracy through validation.
- Reduce manual administrative effort.
- Enforce role-based access control.
- Provide historical records for inspections, maintenance, and asset transfers.

---

# 4. Project Scope

## In Scope

The application will support:

- User authentication
- Role-based authorization
- Military asset registration
- Asset management
- Asset search
- Asset relocation
- Inspection management
- Maintenance tracking
- Readiness status monitoring
- Dashboard reporting
- Audit logging
- Secure data validation

---

## Out of Scope

The application will not include:

- Classified information
- Weapon control systems
- Battlefield command systems
- GPS tracking
- Live military communications
- Procurement systems
- Financial systems
- Multi-installation support (Version 1)
- Artificial intelligence
- Predictive maintenance

---

# 5. Stakeholders

The primary stakeholders include:

- Logistics Managers
- Maintenance Technicians
- System Administrators

---

# 6. User Roles

## Logistics Manager

Responsibilities include:

- Register military assets
- Update asset information
- Monitor readiness
- Approve asset transfers
- View inspection history
- Monitor maintenance progress

---

## Maintenance Technician

Responsibilities include:

- Perform inspections
- Record inspection results
- Perform maintenance
- Update maintenance records
- Return assets to service after verification

---

## System Administrator

Responsibilities include:

- Create user accounts
- Manage user permissions
- Configure system access
- Maintain application settings

---

# 7. Business Process

Military assets move through the following lifecycle:

1. Asset Registration
2. Assignment to Installation
3. Mission Ready
4. Routine Inspection
5. Inspection Evaluation

If inspection passes:

- Return to Mission Ready

If inspection fails:

- Schedule Maintenance
- Perform Maintenance
- Verify Maintenance
- Return to Mission Ready

Eventually:

- Asset Retirement

---

# 8. Business Rules

The application shall enforce the following rules:

- Every asset must have a unique serial number.
- Every asset belongs to one equipment category.
- Every asset has one assigned installation.
- Every asset has one current readiness status.
- Retired assets cannot be modified.
- Only Logistics Managers may approve asset transfers.
- Maintenance must be completed before an asset returns to Mission Ready status.
- Every inspection shall be recorded.
- Every maintenance activity shall be recorded.
- Every transfer shall be logged.
- Only authorized users may access protected features.
- Every action shall be traceable to the authenticated user.

---

# 9. Functional Requirements

The system shall allow authorized users to:

- Log into the application.
- Register military assets.
- View military assets.
- Update military assets.
- Search military assets.
- Filter military assets.
- Schedule inspections.
- Record inspection results.
- Schedule maintenance.
- Record maintenance activities.
- Update readiness status.
- Transfer assets.
- Retire assets.
- View dashboard statistics.

---

# 10. Non-Functional Requirements

## Security

- Role-based authorization
- Password encryption
- Input validation
- Secure authentication

---

## Performance

- Efficient asset searching
- Fast database queries
- Pagination for large datasets

---

## Reliability

- Centralized exception handling
- Consistent database transactions
- Error logging

---

## Maintainability

- Layered architecture
- SOLID design principles
- DTO pattern
- Repository pattern
- Service abstraction

---

## Availability

The application shall be deployable using Docker containers to ensure consistent execution across environments.

---

# 11. Asset Lifecycle

Each military asset follows the lifecycle below:

Asset Registered

↓

Assigned

↓

Mission Ready

↓

Routine Inspection

↓

Inspection Passed?

If Yes

↓

Mission Ready

If No

↓

Maintenance Scheduled

↓

Maintenance Performed

↓

Maintenance Verified

↓

Mission Ready

↓

Retired (when applicable)

---

# 12. Sample Assets

The system is designed to manage individual military assets, including but not limited to:

### Aircraft

- F-35 Lightning II
- F-22 Raptor
- C-17 Globemaster III
- AH-64 Apache
- UH-60 Black Hawk

### Ground Vehicles

- M1 Abrams
- Bradley Fighting Vehicle
- M109 Paladin
- HIMARS

### Unmanned Systems

- MQ-9 Reaper

### Communications Equipment

- Tactical Radio Systems
- Satellite Communication Units

Each asset is tracked individually using its own serial number and operational history.

---

# 13. Technology Stack

## Backend

- Java
- Spring Boot
- Spring Data JPA
- Hibernate

## Database

- PostgreSQL

## Frontend

- React
- HTML
- CSS
- JavaScript

## DevOps

- Docker
- Docker Compose

## Testing

- JUnit 5

---

# 14. Assumptions

This project assumes:

- The application manages one installation in Version 1.
- Equipment information is entered by authorized personnel.
- All users possess valid credentials.
- External government systems are outside the scope of this project.

---

# 15. Constraints

- Educational portfolio project.
- No classified information.
- No real military operational data.
- Uses Java Spring Boot.
- Uses PostgreSQL.
- Uses Docker.
- Uses REST APIs.

---

# 16. Success Criteria

The project will be considered successful if it:

- Successfully tracks military assets.
- Supports inspection workflows.
- Supports maintenance workflows.
- Tracks readiness status.
- Enforces role-based authorization.
- Demonstrates clean software architecture.
- Includes unit testing.
- Runs successfully using Docker.
- Provides professional technical documentation.

---

# 17. Future Enhancements

Potential future improvements include:

- JWT Authentication
- Multi-installation support
- Email notifications
- Advanced reporting
- CI/CD pipeline
- Cloud deployment
- Predictive maintenance analytics
- Dashboard visualizations
- File attachments for maintenance records

---

# Disclaimer

DARMS is an educational software engineering project inspired by enterprise asset management concepts used within large organizations.

This project is not affiliated with, endorsed by, or developed for the United States Department of Defense or any government agency. No classified, controlled, or operational military information is used or represented.
