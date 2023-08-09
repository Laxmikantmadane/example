package com.Springboot.Spring_bootweb3.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Springboot.Spring_bootweb3.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
