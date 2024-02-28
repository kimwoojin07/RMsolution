package com.example.rmsolution.Admin.service;

import com.example.rmsolution.Admin.entity.Admin;
import com.example.rmsolution.Admin.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private Environment environment;

    public void createAdmin() {
        // 환경 변수에서 기본 아이디와 비밀번호 가져오기
        String defaultUsername = environment.getProperty("admin.default.username");
        String defaultPassword = environment.getProperty("admin.default.password");

        // 이미 관리자 계정이 존재하는지 확인
        if (adminRepository.findByUsername(defaultUsername) == null) {
            // 존재하지 않으면 관리자 계정 생성
            Admin admin = new Admin();
            admin.setUsername(defaultUsername);
            admin.setPassword(passwordEncoder.encode(defaultPassword));
            adminRepository.save(admin);
        } else {
            // 이미 관리자 계정이 존재한다면 아무 작업도 수행하지 않음
            System.out.println("이미 관리자 계정이 존재합니다.");
        }
    }
}
