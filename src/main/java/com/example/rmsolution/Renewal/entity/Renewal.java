package com.example.rmsolution.Renewal.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "renewals")
public class Renewal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "subscription_id")
    private Long subscriptionId;

    @Column(name = "extension_period")
    private int extensionPeriod;

    // 생성자, getter 및 setter 메서드
    public Renewal() {
    }

    public Renewal(Long subscriptionId, int extensionPeriod) {
        this.subscriptionId = subscriptionId;
        this.extensionPeriod = extensionPeriod;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
}
