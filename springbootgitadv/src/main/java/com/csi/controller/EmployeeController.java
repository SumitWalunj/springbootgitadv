package com.csi.controller;

import com.csi.model.Employee;
import com.csi.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    EmployeeServiceImpl employeeServiceImpl;

    @PostMapping("/savedata")
    public ResponseEntity<Employee> saveData(@RequestBody Employee employee) {

        return ResponseEntity.ok(employeeServiceImpl.saveData(employee));
    }

    @GetMapping("/getdatabyid/{empId}")
    public ResponseEntity<Optional<Employee>> getDataById(@PathVariable int empId) {

        return ResponseEntity.ok(employeeServiceImpl.getDataById(empId));
    }

    @GetMapping("/getalldata")
    public ResponseEntity<List<Employee>> getAllData() {

        return ResponseEntity.ok(employeeServiceImpl.getAlldata());
    }

    @GetMapping("/say")
    public ResponseEntity<String> sayHello() {

        return ResponseEntity.ok("Welcome to my WORLD");
    }

    @GetMapping("/welcome")
    public ResponseEntity<String> welcome() {

        return ResponseEntity.ok("hello");
    }

    @GetMapping("/hiii")
    public ResponseEntity<String> hiii() {

        return ResponseEntity.ok("hiiiiiiiiiiiiiiii");
    }
}