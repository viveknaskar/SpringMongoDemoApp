package com.viveknaskar.spring_mongo_demo.controllers;

import com.viveknaskar.spring_mongo_demo.models.Employees;
import com.viveknaskar.spring_mongo_demo.repositories.EmployeesRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeesController {

    @Autowired
    private EmployeesRepository employeesRepository;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Employees> employeesList() {
        return employeesRepository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Employees getEmployeeById(@PathVariable("id") ObjectId id) {
        return employeesRepository.findBy_id(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void modifyEmployeeById(@PathVariable("id") ObjectId id, @RequestBody Employees employees) {
        employees.set_id(id);
        employeesRepository.save(employees);
    }

    @RequestMapping( method = RequestMethod.POST)
    public ResponseEntity createEmployee( @RequestBody Employees employees) {
        employees.set_id(ObjectId.get());
        employeesRepository.save(employees);
        return new ResponseEntity(employees, HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteEmployee(@PathVariable ObjectId id) {
        employeesRepository.delete(employeesRepository.findBy_id(id));
    }

}
