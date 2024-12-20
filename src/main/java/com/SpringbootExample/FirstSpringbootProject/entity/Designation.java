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
@Table(name = "Designation")
public class Designation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long designationId;
    private String designationName;

    private boolean isActive;
    private String createdBy;
    private LocalDateTime createdDate;
    private String updatedBy;
    private LocalDateTime updatedDate;



}
