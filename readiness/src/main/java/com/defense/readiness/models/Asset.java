package com.defense.readiness.models;

import java.time.LocalDate;

import com.defense.readiness.enums.AssetStatus;
import com.defense.readiness.enums.MilitaryBranch;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;

@Entity
@Table(name = "assets")
public class Asset {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(nullable = false)
    private String name;

    @NotBlank
    @Column(name = "serial_number", nullable = false, unique = true)
    private String serialNumber;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private MilitaryBranch branch;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private AssetStatus status;

    @NotBlank
    @Column(nullable = false)
    private String manufacturer;

    @PastOrPresent
    @Column(name = "commission_date")
    private LocalDate commissionDate;

    @PastOrPresent
    @Column(name = "last_inspection_date")
    private LocalDate lastInspectionDate;

    @ManyToOne
    @JoinColumn(name = "base_id")
    private Base base;

    public Asset() {
    }

    public Asset(
            String name,
            String serialNumber,
            MilitaryBranch branch,
            AssetStatus status,
            String manufacturer,
            LocalDate commissionDate,
            LocalDate lastInspectionDate) {

        this.name = name;
        this.serialNumber = serialNumber;
        this.branch = branch;
        this.status = status;
        this.manufacturer = manufacturer;
        this.commissionDate = commissionDate;
        this.lastInspectionDate = lastInspectionDate;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public MilitaryBranch getBranch() {
        return branch;
    }

    public void setBranch(MilitaryBranch branch) {
        this.branch = branch;
    }

    public AssetStatus getStatus() {
        return status;
    }

    public void setStatus(AssetStatus status) {
        this.status = status;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public LocalDate getCommissionDate() {
        return commissionDate;
    }

    public void setCommissionDate(LocalDate commissionDate) {
        this.commissionDate = commissionDate;
    }

    public LocalDate getLastInspectionDate() {
        return lastInspectionDate;
    }

    public void setLastInspectionDate(LocalDate lastInspectionDate) {
        this.lastInspectionDate = lastInspectionDate;
    }

    public Base getBase() {
        return base;
    }

    public void setBase(Base base) {
        this.base = base;
    }
}