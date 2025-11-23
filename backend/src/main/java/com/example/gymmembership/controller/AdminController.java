package com.example.gymmembership.controller;

import com.example.gymmembership.entity.Admin;
import com.example.gymmembership.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/admin")
@CrossOrigin(origins = "http://localhost:3000")
public class AdminController {
    @Autowired
    private AdminService adminService;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Admin admin) {
        if (adminService.authenticate(admin.getUsername(), admin.getPassword())) {
            return ResponseEntity.ok().body("Login successful");
        }
        return ResponseEntity.status(401).body("Invalid credentials");
    }
}
