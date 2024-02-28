package com.example.rmsolution.Member.controller;

import com.example.rmsolution.subscription.dto.SubscriptionRequestDTO;
import com.example.rmsolution.subscription.service.SubscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/subscriptions")
public class SubscriptionController {

    @Autowired
    private SubscriptionService subscriptionService;

    @PostMapping("/apply")
    public ResponseEntity<String> applyForSubscription(@RequestBody SubscriptionRequestDTO requestDTO) {
        // 입력된 정보를 서비스를 통해 처리합니다.
        boolean success = subscriptionService.processSubscriptionRequest(requestDTO);

        if (success) {
            return ResponseEntity.ok("Subscription request processed successfully.");
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to process subscription request.");
        }
    }
}