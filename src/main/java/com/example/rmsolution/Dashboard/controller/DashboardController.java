package com.example.rmsolution.Dashboard.controller;

import com.example.rmsolution.Dashboard.dto.UsageInformationDTO;
import com.example.rmsolution.Dashboard.service.DashboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dashboard")
public class DashboardController {

    @Autowired
    private DashboardService dashboardService;

    @GetMapping("/usage-information")
    public ResponseEntity<UsageInformationDTO> getUsageInformation() {
        UsageInformationDTO usageInformationDTO = dashboardService.getUsageInformation();
        return ResponseEntity.ok(usageInformationDTO);
    }
}
