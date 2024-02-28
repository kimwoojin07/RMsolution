package com.example.rmsolution.Dashboard.service;

import com.example.rmsolution.Dashboard.dto.UsageInformationDTO;
import com.example.rmsolution.Subscription.repository.SubscriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DashboardService {

    @Autowired
    private SubscriptionRepository subscriptionRepository;

    public UsageInformationDTO getUsageInformation() {
        int storageUsage = subscriptionRepository.getStorageUsage();
        int remainingPeriod = subscriptionRepository.getRemainingPeriod();

        UsageInformationDTO usageInformationDTO = new UsageInformationDTO();
        usageInformationDTO.setStorageUsage(storageUsage);
        usageInformationDTO.setRemainingPeriod(remainingPeriod);

        return usageInformationDTO;
    }
}
