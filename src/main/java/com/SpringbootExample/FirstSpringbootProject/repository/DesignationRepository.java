package com.SpringbootExample.FirstSpringbootProject.repository;

import com.SpringbootExample.FirstSpringbootProject.entity.Designation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DesignationRepository extends JpaRepository<Designation,Long> {
}
