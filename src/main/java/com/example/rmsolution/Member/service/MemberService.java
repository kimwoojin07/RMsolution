package com.example.rmsolution.Member.service;

import com.example.rmsolution.Member.dto.MemberDTO;
import com.example.rmsolution.Member.entity.Member;
import com.example.rmsolution.Member.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public void signUp(MemberDTO memberDTO) {
        Member member = new Member();
        member.setUsername(memberDTO.getUsername());
        member.setPassword(passwordEncoder.encode(memberDTO.getPassword()));

        memberRepository.save(member);
    }

    public boolean authenticate(String username, String password) {
        Member member = memberRepository.findByUsername(username);
        return member != null && passwordEncoder.matches(password, member.getPassword());
    }
}
