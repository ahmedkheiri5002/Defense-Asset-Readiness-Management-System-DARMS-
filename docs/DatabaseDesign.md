# Database Design

# Defense Asset Readiness Management System (DARMS)

---

# Overview

The Defense Asset Readiness Management System (DARMS) stores information related to military asset readiness, inspections, maintenance activities, user accounts, and asset transfers.

The database follows a relational design using PostgreSQL and is normalized to reduce redundancy while maintaining data integrity.

---

# Database Management System

- PostgreSQL

---

# Design Goals

The database has been designed to:

- Maintain data integrity
- Reduce redundancy
- Support efficient searching
- Enforce business rules
- Support future scalability
- Simplify maintenance

---

# Entity Relationship Overview

The system contains the following primary entities:

- User
- Role
- MilitaryAsset
- Inspection
- MaintenanceRecord
- AssetTransfer

---

# Entity Relationship Diagram

```
Role
 │
 │ 1
 │
 │ *
User

MilitaryAsset
 │
 ├──────────────┐
 │              │
 │ 1            │ 1
 │              │
 │ *            │ *
Inspection   MaintenanceRecord
 │
 │
 └──────────────┐
                │
                │ *
                │
          AssetTransfer
```

---

# Entity Descriptions

## Role

Represents the authorization level assigned to a user.

### Attributes

| Field | Type |
|--------|------|
| id | Long |
| name | String |

Examples:

- Logistics Manager
- Maintenance Technician
- System Administrator

---

## User

Represents an authorized user of the application.

### Attributes

| Field | Type |
|--------|------|
| id | Long |
| username | String |
| password | String |
| firstName | String |
| lastName | String |
| email | String |
| active | Boolean |
| roleId | Long |

---

## MilitaryAsset

Represents one physical military asset.

Each record corresponds to a single piece of equipment.

Examples:

- One F-35
- One M1 Abrams
- One MQ-9 Reaper

### Attributes

| Field | Type |
|--------|------|
| id | Long |
| assetName | String |
| serialNumber | String |
| equipmentType | String |
| branch | String |
| manufacturer | String |
| installation | String |
| readinessStatus | String |
| commissionDate | Date |
| lastInspection | Date |
| retired | Boolean |

---

## Inspection

Represents a completed inspection.

### Attributes

| Field | Type |
|--------|------|
| id | Long |
| inspectionDate | Date |
| result | String |
| notes | String |
| inspectedBy | Long |
| assetId | Long |

---

## MaintenanceRecord

Represents maintenance performed on an asset.

### Attributes

| Field | Type |
|--------|------|
| id | Long |
| maintenanceDate | Date |
| maintenanceType | String |
| description | String |
| completed | Boolean |
| technicianId | Long |
| assetId | Long |

---

## AssetTransfer

Represents the relocation history of an asset.

### Attributes

| Field | Type |
|--------|------|
| id | Long |
| previousLocation | String |
| newLocation | String |
| transferDate | Date |
| approvedBy | Long |
| assetId | Long |

---

# Relationships

## Role → User

One Role

↓

Many Users

Relationship:

```
Role 1 ---- * User
```

---

## MilitaryAsset → Inspection

One Asset

↓

Many Inspections

Relationship:

```
MilitaryAsset 1 ---- * Inspection
```

---

## MilitaryAsset → MaintenanceRecord

One Asset

↓

Many Maintenance Records

Relationship:

```
MilitaryAsset 1 ---- * MaintenanceRecord
```

---

## MilitaryAsset → AssetTransfer

One Asset

↓

Many Transfers

Relationship:

```
MilitaryAsset 1 ---- * AssetTransfer
```

---

# Primary Keys

| Table | Primary Key |
|---------|-------------|
| Role | id |
| User | id |
| MilitaryAsset | id |
| Inspection | id |
| MaintenanceRecord | id |
| AssetTransfer | id |

---

# Foreign Keys

| Table | Foreign Key |
|---------|-------------|
| User | roleId |
| Inspection | assetId |
| Inspection | inspectedBy |
| MaintenanceRecord | assetId |
| MaintenanceRecord | technicianId |
| AssetTransfer | assetId |
| AssetTransfer | approvedBy |

---

# Database Constraints

## User

- Username must be unique.
- Email must be unique.
- Password is required.
- User must have one role.

---

## MilitaryAsset

- Serial number must be unique.
- Asset name is required.
- Equipment type is required.
- Readiness status is required.
- Branch is required.

---

## Inspection

- Every inspection belongs to one asset.
- Inspection date is required.
- Inspector is required.

---

## MaintenanceRecord

- Every maintenance record belongs to one asset.
- Technician is required.
- Maintenance date is required.

---

## AssetTransfer

- Every transfer belongs to one asset.
- Approval is required.
- Transfer date is required.

---

# Suggested Indexes

Indexes should be created for frequently searched fields.

## User

- username
- email

---

## MilitaryAsset

- serialNumber
- assetName
- readinessStatus
- equipmentType
- branch

---

## Inspection

- assetId
- inspectionDate

---

## MaintenanceRecord

- assetId
- maintenanceDate

---

## AssetTransfer

- assetId
- transferDate

---

# Readiness Status Values

Recommended values include:

- Mission Ready
- Under Maintenance
- Inspection Due
- Awaiting Inspection
- Combat Damaged
- Retired

---

# Business Rules Enforced by the Database

The application enforces the following rules:

- Unique serial numbers.
- One current readiness status per asset.
- One assigned installation per asset.
- Every inspection belongs to one asset.
- Every maintenance record belongs to one asset.
- Every transfer belongs to one asset.
- Retired assets cannot be modified by application logic.

---

# Sample Data

Example asset:

| Field | Value |
|--------|-------|
| Asset Name | F-35 Lightning II |
| Serial Number | AF-20341 |
| Equipment Type | Aircraft |
| Branch | United States Air Force |
| Manufacturer | Lockheed Martin |
| Installation | Wright-Patterson Air Force Base |
| Readiness Status | Mission Ready |

---

# Future Database Enhancements

Future versions may introduce additional entities including:

- Maintenance Requests
- Audit Logs
- Notifications
- Attachments
- Asset Categories
- Multiple Installations
- Parts Inventory
- Maintenance Scheduling
- JWT Authentication Tables

---

# Database Summary

The DARMS database is designed using a normalized relational model that supports enterprise asset lifecycle management.

The schema separates users, assets, inspections, maintenance records, and transfers into independent entities connected through well-defined relationships. This design promotes maintainability, scalability, and efficient querying while supporting the application's business workflows.
