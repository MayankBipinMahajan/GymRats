package com.example.gymmembership.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "membership_plans")
public class MembershipPlan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Double cost;
    private Integer durationInMonths;
    private String description;
}
