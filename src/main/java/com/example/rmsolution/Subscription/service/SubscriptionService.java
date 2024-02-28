package com.example.rmsolution.Subscription.service;

import com.example.rmsolution.Subscription.entity.Subscription;
import com.example.rmsolution.Subscription.repository.SubscriptionRepository;
import com.example.rmsolution.Subscription.dto.SubscriptionRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubscriptionService {

    @Autowired
    private SubscriptionRepository subscriptionRepository;

    // 구독 신청 요청을 처리하는 메서드
    public boolean processSubscriptionRequest(SubscriptionRequestDTO requestDTO) {
        // 필수 정보와 부가 정보를 검증합니다.
        if (validateSubscriptionRequest(requestDTO)) {
            // 요청이 유효하면 데이터베이스에 저장합니다.
            Subscription subscription = new Subscription();
            subscription.setServiceType(requestDTO.getServiceType());
            subscription.setStorageCapacity(requestDTO.getStorageCapacity());
            subscription.setEmail(requestDTO.getEmail());
            subscription.setCompanyName(requestDTO.getCompanyName());
            subscription.setPhoneNumber(requestDTO.getPhoneNumber());
            subscription.setAddress(requestDTO.getAddress());


            // 데이터베이스에 저장
            subscriptionRepository.save(subscription);

            return true; // 성공
        } else {
            return false; // 실패
        }
    }

    // 유효성 검사 메서드
    private boolean validateSubscriptionRequest(SubscriptionRequestDTO requestDTO) {
        return true;
    }
}
