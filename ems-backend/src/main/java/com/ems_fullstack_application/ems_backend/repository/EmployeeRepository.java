package com.ems_fullstack_application.ems_backend.repository;

import com.ems_fullstack_application.ems_backend.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
