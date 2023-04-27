package com.csi.dao;

import com.csi.model.Employee;
import com.csi.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class EmployeeDaoImpl {

    @Autowired
    EmployeeRepo employeeRepoImpl;

    public Employee saveData(Employee employee) {

        return employeeRepoImpl.save(employee);
    }

    public Optional<Employee> getDataById(int empId) {

        return employeeRepoImpl.findById(empId);
    }

    public List<Employee> getAlldata() {

        return employeeRepoImpl.findAll();
    }
}
