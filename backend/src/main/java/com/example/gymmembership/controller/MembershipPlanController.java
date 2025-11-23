package com.example.gymmembership.controller;

import com.example.gymmembership.entity.MembershipPlan;
import com.example.gymmembership.service.MembershipPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/plans")
@CrossOrigin(origins = "http://localhost:3000")
public class MembershipPlanController {
    @Autowired
    private MembershipPlanService membershipPlanService;

    @GetMapping
    public List<MembershipPlan> getAllPlans() {
        return membershipPlanService.getAllPlans();
    }
}
