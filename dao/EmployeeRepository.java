package com.timecard.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.timecard.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer>{

}
