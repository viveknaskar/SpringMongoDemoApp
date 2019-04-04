package com.viveknaskar.spring_mongo_demo.models;

import org.bson.types.ObjectId;

public class Employees {

    public ObjectId _id;
    public String name;
    public String role;
    public String salary;

    //Empty Constructor
    public  Employees(){}

    public Employees(ObjectId _id, String name, String role, String salary) {
        this._id = _id;
        this.name = name;
        this.role = role;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

}
