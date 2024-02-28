package com.example.rmsolution.Renewal.dto;

public class RenewalRequestDTO {
    private Long subscriptionId; // 구독 ID
    private int extensionPeriod; // 연장 기간

    public RenewalRequestDTO() {
    }

    public RenewalRequestDTO(Long subscriptionId, int extensionPeriod) {
        this.subscriptionId = subscriptionId;
        this.extensionPeriod = extensionPeriod;
    }

    public Long getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(Long subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public int getExtensionPeriod() {
        return extensionPeriod;
    }

    public void setExtensionPeriod(int extensionPeriod) {
        this.extensionPeriod = extensionPeriod;
    }

    // 구현 요청: toString() 메서드 추가
    @Override
    public String toString() {
        return "RenewalRequestDTO{" +
                "subscriptionId=" + subscriptionId +
                ", extensionPeriod=" + extensionPeriod +
                '}';
    }
}
