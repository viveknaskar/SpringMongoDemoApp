package com.viveknaskar.spring_mongo_demo.controllers;

import com.viveknaskar.spring_mongo_demo.models.Employee;
import com.viveknaskar.spring_mongo_demo.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    /**
     * findAll() is just a method which Spring Data MongoRepository provides internally.
     * @return
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Employee> employeesList() {
        return employeeRepository.findAll();
    }

    @RequestMapping(value = "create", method = RequestMethod.POST)
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }

}
