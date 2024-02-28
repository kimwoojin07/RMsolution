package com.example.rmsolution.Renewal.service;

import com.example.rmsolution.Renewal.dto.RenewalRequestDTO;
import com.example.rmsolution.Subscription.entity.Subscription;
import com.example.rmsolution.Subscription.repository.SubscriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RenewalService {

    @Autowired
    private SubscriptionRepository subscriptionRepository;

    public boolean processRenewalRequest(RenewalRequestDTO requestDTO) {
        Subscription subscription = subscriptionRepository.findById(requestDTO.getSubscriptionId()).orElse(null);

        if (subscription != null) {
            int currentPeriod = subscription.getSubscriptionPeriod();
            subscription.setSubscriptionPeriod(currentPeriod + requestDTO.getExtensionPeriod());

            subscriptionRepository.save(subscription);
            return true;
        } else {
            return false;
        }
    }
}
