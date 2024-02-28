package com.example.rmsolution.Member.controller;

import com.example.rmsolution.Member.dto.MemberDTO;
import com.example.rmsolution.Member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {

    @Autowired
    private MemberService memberService;

    @PostMapping(value = "/member")
    public ResponseEntity<?> signUp(@RequestBody MemberDTO memberDTO) {
        memberService.signUp(memberDTO);
        return ResponseEntity.ok().build();
    }

}

