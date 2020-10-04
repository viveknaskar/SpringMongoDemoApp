package com.viveknaskar.spring_mongo_demo.services;

import com.viveknaskar.spring_mongo_demo.models.Employee;

import java.util.List;

public interface EmployeeDAL {

    List<Employee> getAllEmployees();

    Employee addNewEmployee(Employee employee);


}
