package com.defense.readiness.models;

import java.time.LocalDate;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "transfer_records")
public class TransferRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "asset_id", nullable = false)
    private Asset asset;

    @ManyToOne
    @JoinColumn(name = "from_base_id")
    private Base fromBase;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "to_base_id", nullable = false)
    private Base toBase;

    @NotNull
    @Column(name = "request_date", nullable = false)
    private LocalDate requestDate;

    @Column(name = "transfer_date")
    private LocalDate transferDate;

    @NotBlank
    @Column(nullable = false, length = 1000)
    private String reason;

    @NotBlank
    @Column(nullable = false)
    private String status;

    public TransferRecord() {
    }

    public TransferRecord(
            Asset asset,
            Base fromBase,
            Base toBase,
            LocalDate requestDate,
            LocalDate transferDate,
            String reason,
            String status) {

        this.asset = asset;
        this.fromBase = fromBase;
        this.toBase = toBase;
        this.requestDate = requestDate;
        this.transferDate = transferDate;
        this.reason = reason;
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

    public Base getFromBase() {
        return fromBase;
    }

    public void setFromBase(Base fromBase) {
        this.fromBase = fromBase;
    }

    public Base getToBase() {
        return toBase;
    }

    public void setToBase(Base toBase) {
        this.toBase = toBase;
    }

    public LocalDate getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(LocalDate requestDate) {
        this.requestDate = requestDate;
    }

    public LocalDate getTransferDate() {
        return transferDate;
    }

    public void setTransferDate(LocalDate transferDate) {
        this.transferDate = transferDate;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}