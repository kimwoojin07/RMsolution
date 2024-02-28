package com.example.rmsolution.Subscription.repository;

import com.example.rmsolution.Subscription.entity.Subscription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface SubscriptionRepository extends JpaRepository<Subscription, Long> {
    //데이터베이스에서 스토리지 사용량을 조회하는 역할.
    @Query("SELECT SUM(s.storageCapacity) FROM Subscription s")
    int getStorageUsage();

    @Query("SELECT s.subscriptionPeriod FROM Subscription s")
    int getRemainingPeriod();
}
