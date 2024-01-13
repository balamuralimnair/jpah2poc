package com.poc.jpah2poc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.poc.jpah2poc.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
