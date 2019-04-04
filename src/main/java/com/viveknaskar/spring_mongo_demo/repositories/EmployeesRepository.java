package com.viveknaskar.spring_mongo_demo.repositories;

import com.viveknaskar.spring_mongo_demo.models.Employees;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeesRepository extends MongoRepository<Employees, String> {

    Employees findBy_id(ObjectId _id);

}


