package com.timecard.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.timecard.model.Employee;
import com.timecard.service.EmployeeService;


@RestController
@CrossOrigin(origins = "http://localhost:8088")
public class EmployeeController {

    //Injecting the service
    @Autowired
    private EmployeeService service;

    ArrayList<Employee> employee;

    //Method one, the old way of mapping requests
    //    @RequestMapping(path ="/getEmployeelist",method = RequestMethod.GET)

    //Method 2 => directly straight to the point
    @GetMapping("/getEmployeelist")
  
    public List<Employee> fetchEmployeeList(){
        //Logic to fetch list from database
    	employee = new ArrayList<>();
    	employee = service.fetchEmployeeFromRepository();
         return employee;
    }

    @PostMapping("/addEmployee")
  
    public Employee saveEmployee(@RequestBody Employee employee){
        //Logic to save the Employee into database
    	Employee employee1 = new Employee();
       return service.persistEmployeeIntoRepository(employee1);
    }

	

}
