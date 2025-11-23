package com.example.gymmembership.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Entity
@Data
@Table(name = "members")
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String phoneNumber;
    private LocalDate startDate;
    private String planType; // e.g., "Basic", "Premium"

    @Lob
    @Column(columnDefinition = "CLOB")
    private String profileImage; // Base64 encoded image
}
