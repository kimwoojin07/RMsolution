package com.example.rmsolution.Member.service;

import com.example.rmsolution.subscription.controller.repository.SubscriptionRepository;
import com.example.rmsolution.subscription.dto.SubscriptionRequestDTO;
import com.example.rmsolution.subscription.model.Subscription;
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
            subscription.setDuration(requestDTO.getSubscriptionPeriod());
            subscription.setCompanyName(requestDTO.getCompanyName());
            subscription.setPhoneNumber(requestDTO.getPhoneNumber());
            subscription.setEmail(requestDTO.getEmail());
            subscription.setAddress(requestDTO.getAddress());

            // 데이터베이스에 저장합니다.
            subscriptionRepository.save(subscription);

            return true; // 성공
        } else {
            return false; // 실패
        }
    }

    // 유효성 검사 메서드
    private boolean validateSubscriptionRequest(SubscriptionRequestDTO requestDTO) {
        // 여기에 필수 정보와 부가 정보의 유효성을 검사하는 로직을 추가합니다.
        // 예를 들어, 필수 정보가 비어있는지, 이메일 형식이 올바른지 등을 검사할 수 있습니다.
        // 이 예시에서는 간단히 true를 반환하도록 하겠습니다.
        return true;
    }
}
