package com.viveknaskar.spring_mongo_demo.controllers;

import com.viveknaskar.spring_mongo_demo.repositories.EmployeesRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class EmployeesControllerTest {

    @Mock
    private EmployeesRepository employeesRepository;

    @Before
    public void setUp(){

    }

    @Test
    public void employeesList() throws Exception {
    }

    @Test
    public void getEmployeeById() throws Exception {
    }

    @Test
    public void modifyEmployeeById() throws Exception {
    }

    @Test
    public void createEmployee() throws Exception {
        //when()
    }

    @Test
    public void deleteEmployee() throws Exception {
    }

}