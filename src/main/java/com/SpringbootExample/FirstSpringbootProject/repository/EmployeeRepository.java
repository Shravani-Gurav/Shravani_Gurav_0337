package com.SpringbootExample.FirstSpringbootProject.repository;

import com.SpringbootExample.FirstSpringbootProject.entity.EmployeeInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<EmployeeInfo,Long> {
}
