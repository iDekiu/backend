package com.dvk.crudspringangular.service;

import java.util.List;

import com.dvk.crudspringangular.model.Employee;

public interface EmployeeService {

    Employee create(Employee employee);
    Employee getById(Long id);
    List<Employee> getAll();
    Employee update(Employee employee);
    void deleteById (Long id);


}
