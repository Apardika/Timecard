package com.timecard.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.timecard.dao.EmployeeRepository;
import com.timecard.model.Employee;
@Service

public class EmployeeService {
	
	//Injecting the repository
    @Autowired
    private EmployeeRepository repo;

    //Local Employee
   

    public ArrayList<Employee> fetchEmployeeFromRepository(){
        return (ArrayList<Employee>) repo.findAll();
    }

    public Employee persistEmployeeIntoRepository(Employee Emp){
       return repo.save(Emp);
    }

    public Optional<Employee> fetchEmployeeFromRepositoryById(int id)
    {
       
        return repo.findById(id);
    }

  
     public String deleteEmployeeById(int id) {
        try
        {
            repo.deleteById(id);
            return "Employee Deleted Successfully";
        }catch (Exception e){
            return "Employee not found";
        }

    }

}
