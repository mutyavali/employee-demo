package com.Employee.Employee.demo.service;

import com.Employee.Employee.demo.entity.Employee;
import com.Employee.Employee.demo.repository.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;

@Service
public class EmpService {
    @Autowired
    private EmpRepository employeeRepo;
    public Employee saveEmployee(Employee empDTO){
        Employee employee= Employee.builder().
                                    firstName (empDTO.getFirstName())
                                   .lastName (empDTO.getLastName ()  )
                                    .email ( empDTO.getEmail ( ) )
                                    .phoneNums ( empDTO.getPhoneNums ( ) )
                                    .doj ( empDTO.getDoj ( ) )
                                    .salary ( empDTO.getSalary ( ) )
                                    .build();

        System.out.println("employee" +employee);
        return  employeeRepo.save(employee);
    }
    public List<Employee> display() {
        List<Employee> employeeList = employeeRepo.findAll();
        System.out.println("employeeList: "+employeeList);
        employeeList.forEach(System.out::println);

        return employeeList;
    }


}


