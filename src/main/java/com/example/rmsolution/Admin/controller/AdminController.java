package com.example.rmsolution.Admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @GetMapping("/dashboard")
    public String adminDashboard() {
        // 관리자 대시보드 페이지로 이동
        return "admin/dashboard";
    }

    @GetMapping("/subscriptions")
    public String adminSubscriptions() {
        // 서비스 구독 관리 페이지로 이동
        return "admin/subscriptions";
    }

    @PostMapping("/subscriptions/{subscriptionId}/approve")
    public String approveSubscription(Long subscriptionId) {
        // 구독 신청 승인 처리
        return "redirect:/admin/subscriptions";
    }

    @GetMapping("/usage")
    public String serviceUsage() {
        // 서비스 사용현황 대시보드 페이지로 이동
        return "admin/usage";
    }

    @PostMapping("/subscription/{subscriptionId}/extend")
    public String extendSubscription(Long subscriptionId) {
        // 서비스 기간 연장 요청 처리
        return "redirect:/admin/subscriptions";
    }

}
