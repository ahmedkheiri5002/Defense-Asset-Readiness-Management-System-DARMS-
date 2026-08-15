package com.defense.readiness.models;

import java.time.LocalDate;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;

@Entity
@Table(name = "maintenance_records")
public class MaintenanceRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "asset_id", nullable = false)
    private Asset asset;

    @NotBlank
    @Column(name = "maintenance_type", nullable = false)
    private String maintenanceType;

    @NotBlank
    @Column(nullable = false, length = 1000)
    private String description;

    @NotNull
    @PastOrPresent
    @Column(name = "maintenance_date", nullable = false)
    private LocalDate maintenanceDate;

    @NotBlank
    @Column(nullable = false)
    private String technician;

    @NotBlank
    @Column(nullable = false)
    private String status;

    public MaintenanceRecord() {
    }

    public MaintenanceRecord(
            Asset asset,
            String maintenanceType,
            String description,
            LocalDate maintenanceDate,
            String technician,
            String status) {

        this.asset = asset;
        this.maintenanceType = maintenanceType;
        this.description = description;
        this.maintenanceDate = maintenanceDate;
        this.technician = technician;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public Asset getAsset() {
        return asset;
    }

    public void setAsset(Asset asset) {
        this.asset = asset;
    }

    public String getMaintenanceType() {
        return maintenanceType;
    }

    public void setMaintenanceType(String maintenanceType) {
        this.maintenanceType = maintenanceType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getMaintenanceDate() {
        return maintenanceDate;
    }

    public void setMaintenanceDate(LocalDate maintenanceDate) {
        this.maintenanceDate = maintenanceDate;
    }

    public String getTechnician() {
        return technician;
    }

    public void setTechnician(String technician) {
        this.technician = technician;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}