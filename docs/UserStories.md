# User Stories

# Defense Asset Readiness Management System (DARMS)

---

# Overview

This document contains the Agile user stories for the Defense Asset Readiness Management System (DARMS).

User stories are organized into Epics that represent major functional areas of the application.

Each story follows the format:

> **As a** <user role>,
> **I want** <goal>,
> **so that** <business value>.

---

# Epic 1 — User Authentication & Authorization

## US-1.1 Login

**As a** Logistics Manager, Maintenance Technician, or System Administrator,

**I want** to securely log into the application,

**so that** I can access features based on my assigned role.

### Acceptance Criteria

- User enters username and password.
- Credentials are validated.
- Authorized users are redirected to the dashboard.
- Invalid credentials display an error message.

**Priority:** High

---

## US-1.2 Role-Based Access

**As a** System Administrator,

**I want** users to access only features permitted by their role,

**so that** sensitive operations remain secure.

### Acceptance Criteria

- Unauthorized pages cannot be accessed.
- Users only see features available to their role.

**Priority:** High

---

# Epic 2 — Military Asset Management

## US-2.1 Register Asset

**As a** Logistics Manager,

**I want** to register a new military asset,

**so that** it can be tracked throughout its lifecycle.

### Acceptance Criteria

- Asset information is validated.
- Serial number must be unique.
- Asset is successfully saved.

**Priority:** High

---

## US-2.2 View Asset

**As a** Logistics Manager,

**I want** to view detailed information about an asset,

**so that** I can monitor its operational status.

### Acceptance Criteria

- Asset details are displayed.
- Current readiness status is visible.
- Inspection history is available.

**Priority:** High

---

## US-2.3 Update Asset

**As a** Logistics Manager,

**I want** to update asset information,

**so that** records remain accurate.

### Acceptance Criteria

- Editable fields are validated.
- Changes are saved successfully.
- Retired assets cannot be modified.

**Priority:** High

---

## US-2.4 Retire Asset

**As a** Logistics Manager,

**I want** to retire an asset,

**so that** it is removed from operational readiness tracking.

### Acceptance Criteria

- Asset status changes to Retired.
- Retired assets cannot be edited.
- Historical records remain accessible.

**Priority:** Medium

---

# Epic 3 — Asset Search

## US-3.1 Search by Serial Number

**As a** Logistics Manager,

**I want** to search assets using a serial number,

**so that** I can quickly locate a specific asset.

### Acceptance Criteria

- Exact serial number search is supported.
- Matching asset is displayed.

**Priority:** High

---

## US-3.2 Filter Assets

**As a** Logistics Manager,

**I want** to filter assets,

**so that** I can quickly find equipment matching specific criteria.

### Acceptance Criteria

Users can filter by:

- Equipment Type
- Branch
- Manufacturer
- Readiness Status

**Priority:** High

---

# Epic 4 — Inspection Management

## US-4.1 Record Inspection

**As a** Maintenance Technician,

**I want** to record inspection results,

**so that** the asset's readiness can be evaluated.

### Acceptance Criteria

- Inspection date is recorded.
- Inspector information is stored.
- Inspection result is saved.

**Priority:** High

---

## US-4.2 View Inspection History

**As a** Logistics Manager,

**I want** to review inspection history,

**so that** I can monitor maintenance compliance.

### Acceptance Criteria

- Previous inspections are displayed.
- Inspection results remain read-only.

**Priority:** Medium

---

# Epic 5 — Maintenance Management

## US-5.1 Schedule Maintenance

**As a** Maintenance Technician,

**I want** to schedule maintenance,

**so that** failed inspections can be resolved.

### Acceptance Criteria

- Maintenance request is created.
- Asset status changes to Under Maintenance.

**Priority:** High

---

## US-5.2 Complete Maintenance

**As a** Maintenance Technician,

**I want** to record completed maintenance,

**so that** assets can return to operational status.

### Acceptance Criteria

- Maintenance completion is recorded.
- Completion date is stored.
- Maintenance notes are saved.

**Priority:** High

---

## US-5.3 Return Asset to Mission Ready

**As a** Logistics Manager,

**I want** assets to return to Mission Ready only after maintenance is verified,

**so that** operational readiness remains accurate.

### Acceptance Criteria

- Maintenance must be completed.
- Verification is required.
- Asset status changes to Mission Ready.

**Priority:** High

---

# Epic 6 — Asset Transfers

## US-6.1 Transfer Asset

**As a** Logistics Manager,

**I want** to relocate an asset,

**so that** its current location remains accurate.

### Acceptance Criteria

- New location is recorded.
- Previous location is stored.
- Transfer is logged.

**Priority:** Medium

---

# Epic 7 — Dashboard

## US-7.1 Readiness Dashboard

**As a** Logistics Manager,

**I want** to view readiness statistics,

**so that** I can quickly assess operational capability.

### Acceptance Criteria

Dashboard displays:

- Mission Ready Assets
- Assets Under Maintenance
- Inspections Due
- Assets by Branch
- Assets by Equipment Type

**Priority:** High

---

# Epic 8 — Administration

## US-8.1 Create User

**As a** System Administrator,

**I want** to create new user accounts,

**so that** authorized personnel can access the application.

### Acceptance Criteria

- User information is validated.
- User account is created.
- Role is assigned.

**Priority:** High

---

## US-8.2 Update User

**As a** System Administrator,

**I want** to modify user information,

**so that** account information remains accurate.

### Acceptance Criteria

- User details are updated.
- Role changes are saved.

**Priority:** Medium

---

## US-8.3 Disable User

**As a** System Administrator,

**I want** to deactivate user accounts,

**so that** former personnel cannot access the system.

### Acceptance Criteria

- User account becomes inactive.
- Inactive users cannot log in.

**Priority:** Medium

---

# Product Backlog Summary

| Epic | Description | Priority |
|-------|-------------|----------|
| Epic 1 | Authentication & Authorization | High |
| Epic 2 | Military Asset Management | High |
| Epic 3 | Asset Search | High |
| Epic 4 | Inspection Management | High |
| Epic 5 | Maintenance Management | High |
| Epic 6 | Asset Transfers | Medium |
| Epic 7 | Dashboard | High |
| Epic 8 | Administration | High |

---

# Sprint Recommendation

## Sprint 0

- Requirements
- Documentation
- Architecture
- Database Design

## Sprint 1

- Authentication
- User Management

## Sprint 2

- Military Asset Management

## Sprint 3

- Inspection Management

## Sprint 4

- Maintenance Management

## Sprint 5

- Dashboard
- Search
- Asset Transfers

## Sprint 6

- Frontend
- Testing
- Documentation
