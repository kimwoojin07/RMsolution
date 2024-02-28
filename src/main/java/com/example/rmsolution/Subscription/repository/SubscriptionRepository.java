package com.example.rmsolution.Member.repository;

import com.example.rmsolution.subscription.model.Subscription;
import jdk.jshell.JShell;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubscriptionRepository extends JpaRepository<JShell.Subscription, Long> {
    // 추가적인 메서드가 필요하다면 여기에 선언할 수 있습니다.
}