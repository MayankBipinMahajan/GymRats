package com.example.gymmembership.config;

import com.example.gymmembership.entity.Admin;
import com.example.gymmembership.entity.MembershipPlan;
import com.example.gymmembership.service.AdminService;
import com.example.gymmembership.service.MembershipPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataSeeder implements CommandLineRunner {

    @Autowired
    private MembershipPlanService planService;

    @Autowired
    private AdminService adminService;

    @Override
    public void run(String... args) throws Exception {
        if (planService.getAllPlans().isEmpty()) {
            MembershipPlan basic = new MembershipPlan();
            basic.setName("Basic");
            basic.setCost(29.99);
            basic.setDurationInMonths(1);
            basic.setDescription("Access to gym equipment during off-peak hours.");
            planService.createPlan(basic);

            MembershipPlan premium = new MembershipPlan();
            premium.setName("Premium");
            premium.setCost(59.99);
            premium.setDurationInMonths(1);
            premium.setDescription("24/7 access, all classes included, sauna access.");
            planService.createPlan(premium);

            MembershipPlan annual = new MembershipPlan();
            annual.setName("Annual VIP");
            annual.setCost(499.99);
            annual.setDurationInMonths(12);
            annual.setDescription("All premium benefits for a full year + personal trainer sessions.");
            planService.createPlan(annual);
        }

        // Create default admin
        Admin admin = new Admin();
        admin.setUsername("admin");
        admin.setPassword("admin123"); // In real app, hash this!
        try {
            adminService.createAdmin(admin);
        } catch (Exception e) {
            // Admin might already exist
        }
    }
}
