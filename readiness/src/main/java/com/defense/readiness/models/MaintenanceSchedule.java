package com.defense.readiness.models;

import java.time.LocalDate;

import jakarta.persistence.*;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "maintenance_schedules")
public class MaintenanceSchedule {

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

    @NotNull
    @FutureOrPresent
    @Column(name = "scheduled_date", nullable = false)
    private LocalDate scheduledDate;

    @NotBlank
    @Column(nullable = false)
    private String priority;

    @NotBlank
    @Column(nullable = false)
    private String status;

    public MaintenanceSchedule() {
    }

    public MaintenanceSchedule(
            Asset asset,
            String maintenanceType,
            LocalDate scheduledDate,
            String priority,
            String status) {

        this.asset = asset;
        this.maintenanceType = maintenanceType;
        this.scheduledDate = scheduledDate;
        this.priority = priority;
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

    public LocalDate getScheduledDate() {
        return scheduledDate;
    }

    public void setScheduledDate(LocalDate scheduledDate) {
        this.scheduledDate = scheduledDate;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}