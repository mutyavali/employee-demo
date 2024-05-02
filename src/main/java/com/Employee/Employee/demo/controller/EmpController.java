package com.Employee.Employee.demo.controller;

import com.Employee.Employee.demo.entity.Employee;
import com.Employee.Employee.demo.service.EmpService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmpController {
    @Autowired
    EmpService empService;
    @PostMapping ("/save")
    public ResponseEntity<Employee> saveEmployee(@RequestBody @Valid Employee empDTO){
        return new ResponseEntity<>(empService.saveEmployee(empDTO), HttpStatus.CREATED);
    }
    @GetMapping ("/getusers")
    public ResponseEntity<List<Employee>> display() {
        return ResponseEntity.ok(empService.display());
    }
}
