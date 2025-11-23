package com.example.gymmembership.controller;

import com.example.gymmembership.entity.Member;
import com.example.gymmembership.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/members")
@CrossOrigin(origins = "http://localhost:3000")
public class MemberController {
    @Autowired
    private MemberService memberService;

    @GetMapping
    public List<Member> getAllMembers() {
        return memberService.getAllMembers();
    }

    @PostMapping(consumes = org.springframework.http.MediaType.MULTIPART_FORM_DATA_VALUE)
    public Member registerMember(
            @RequestParam("name") String name,
            @RequestParam("email") String email,
            @RequestParam("phoneNumber") String phoneNumber,
            @RequestParam("planType") String planType,
            @RequestParam("startDate") String startDate,
            @RequestParam(value = "image", required = false) org.springframework.web.multipart.MultipartFile image)
            throws java.io.IOException {

        Member member = new Member();
        member.setName(name);
        member.setEmail(email);
        member.setPhoneNumber(phoneNumber);
        member.setPlanType(planType);
        member.setStartDate(java.time.LocalDate.parse(startDate));

        String imageBase64 = null;
        if (image != null && !image.isEmpty()) {
            byte[] bytes = image.getBytes();
            imageBase64 = "data:" + image.getContentType() + ";base64,"
                    + java.util.Base64.getEncoder().encodeToString(bytes);
        }

        return memberService.registerMemberWithImage(member, imageBase64);
    }
}
