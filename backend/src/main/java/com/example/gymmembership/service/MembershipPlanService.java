package com.example.gymmembership.service;

import com.example.gymmembership.entity.MembershipPlan;
import com.example.gymmembership.repository.MembershipPlanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MembershipPlanService {
    @Autowired
    private MembershipPlanRepository membershipPlanRepository;

    public List<MembershipPlan> getAllPlans() {
        return membershipPlanRepository.findAll();
    }

    public MembershipPlan createPlan(MembershipPlan plan) {
        return membershipPlanRepository.save(plan);
    }
}
