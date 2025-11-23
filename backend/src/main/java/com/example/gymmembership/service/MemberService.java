package com.example.gymmembership.service;

import com.example.gymmembership.entity.Member;
import com.example.gymmembership.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MemberService {
    @Autowired
    private MemberRepository memberRepository;

    public List<Member> getAllMembers() {
        return memberRepository.findAll();
    }

    public Member registerMember(Member member) {
        // Add validation logic here
        return memberRepository.save(member);
    }

    public Member registerMemberWithImage(Member member, String imageBase64) {
        if (imageBase64 != null && !imageBase64.isEmpty()) {
            member.setProfileImage(imageBase64);
        }
        return memberRepository.save(member);
    }
}
