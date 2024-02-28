package com.example.rmsolution.Admin.service;

import com.example.rmsolution.Admin.entity.Admin;
import com.example.rmsolution.Admin.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public void createAdmin() {
        // 기본 아이디와 비밀번호 설정
        String username = "admin";
        String password = "admin2580!";

        // 이미 관리자 계정이 존재하는지 확인
        if (adminRepository.findByUsernameAndPasswordHash(username,password) == null) {
            // 존재하지 않으면 관리자 계정 생성
            Admin admin = new Admin();
            admin.setUsername(username);
            admin.setPassword(passwordEncoder.encode(password));
            adminRepository.save(admin);
        } else {
            // 이미 관리자 계정이 존재한다면 아무 작업도 수행하지 않음
            System.out.println("이미 관리자 계정이 존재합니다.");
        }
    }
}
