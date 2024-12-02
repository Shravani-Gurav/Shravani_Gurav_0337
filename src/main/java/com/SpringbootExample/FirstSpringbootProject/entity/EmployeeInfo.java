package com.SpringbootExample.FirstSpringbootProject.entity;

import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "EmployeeInfo")

public class EmployeeInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long employeeId;
    private String employeeFirstName;
    private String employeeLastName;
    private String email;
    private String mobileNo;
    private int age;
    private String Address;
    private String dateOfJoining;
    private double salary;

    private boolean isActive;
    private String createdBy;
    private LocalDateTime createdDate;
    private String updatedBy;
    private LocalDateTime updatedDate;

}
