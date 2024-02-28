package com.example.rmsolution.Member.service.util;

import com.example.rmsolution.Member.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AdminInitializer implements CommandLineRunner {

    @Autowired
    private AdminService adminService;

    @Override
    public void run(String... args) throws Exception {
        adminService.createAdmin("admin","admin2580!");
    }
}
