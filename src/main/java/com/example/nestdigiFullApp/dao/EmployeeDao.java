package com.example.nestdigiFullApp.dao;

import com.example.nestdigiFullApp.Model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeDao extends CrudRepository<Employee,Integer> {
}
