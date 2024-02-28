package com.example.rmsolution.Renewal.controller;

import com.example.rmsolution.Renewal.dto.RenewalRequestDTO;
import com.example.rmsolution.Renewal.service.RenewalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/renewals")
public class RenewalController {

    @Autowired
    private RenewalService renewalService;

    @PostMapping("/request")
    public ResponseEntity<String> processRenewalRequest(@RequestBody RenewalRequestDTO requestDTO) {
        boolean success = renewalService.processRenewalRequest(requestDTO);

        if (success) {
            return ResponseEntity.ok("구독 연장 요청이 성공적으로 처리되었습니다.");
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("구독 연장 요청에 실패하였습니다.");
        }
    }
}
