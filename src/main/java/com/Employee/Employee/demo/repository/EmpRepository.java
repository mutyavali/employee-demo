package com.Employee.Employee.demo.repository;

import com.Employee.Employee.demo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpRepository extends JpaRepository<Employee,Long> {
}
