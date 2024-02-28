package com.example.rmsolution.Dashboard.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "usage_information")
public class UsageInformation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "storage_usage")
    private int storageUsage;

    @Column(name = "remaining_period")
    private int remainingPeriod;


    public UsageInformation() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getStorageUsage() {
        return storageUsage;
    }

    public void setStorageUsage(int storageUsage) {
        this.storageUsage = storageUsage;
    }

    public int getRemainingPeriod() {
        return remainingPeriod;
    }

    public void setRemainingPeriod(int remainingPeriod) {
        this.remainingPeriod = remainingPeriod;
    }
}
