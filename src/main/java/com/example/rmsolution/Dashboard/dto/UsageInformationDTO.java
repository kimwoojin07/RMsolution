package com.example.rmsolution.Dashboard.dto;

public class UsageInformationDTO {

    private int storageUsage;
    private int remainingPeriod;

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
