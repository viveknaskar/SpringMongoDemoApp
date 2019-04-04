package com.viveknaskar.spring_mongo_demo.models;

import org.bson.types.ObjectId;

public class Employees {

    private ObjectId _id;
    private String name;
    private String role;
    private String salary;

    //Empty Constructor
    public Employees(){}

    public Employees(ObjectId _id, String name, String role, String salary) {
        this._id = _id;
        this.name = name;
        this.role = role;
        this.salary = salary;
    }

    public ObjectId get_id() {
        return _id;
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
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
