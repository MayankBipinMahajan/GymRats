package com.example.gymmembership.service;

import com.example.gymmembership.entity.Admin;
import com.example.gymmembership.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class AdminService {
    @Autowired
    private AdminRepository adminRepository;

    public boolean authenticate(String username, String password) {
        Optional<Admin> admin = adminRepository.findByUsername(username);
        return admin.isPresent() && admin.get().getPassword().equals(password);
    }

    public Admin createAdmin(Admin admin) {
        return adminRepository.save(admin);
    }
}
