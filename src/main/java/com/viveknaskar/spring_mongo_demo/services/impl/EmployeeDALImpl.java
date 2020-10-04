package com.viveknaskar.spring_mongo_demo.services.impl;

import com.viveknaskar.spring_mongo_demo.models.Employee;
import com.viveknaskar.spring_mongo_demo.services.EmployeeDAL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDALImpl implements EmployeeDAL {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public List<Employee> getAllEmployees() {
        return mongoTemplate.findAll(Employee.class);
    }

    @Override
    public Employee addNewEmployee(Employee employee) {
        mongoTemplate.save(employee);
        // Now, employee object will contain the ID as well
        return employee;
    }
}
