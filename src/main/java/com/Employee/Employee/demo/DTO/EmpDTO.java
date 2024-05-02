package com.Employee.Employee.demo.DTO;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmpDTO {
    private Long employeeId;
    @NotNull(message="Firstname Should n't be empty")
    private String firstName;
    @NotNull(message="Lastname Should n't be empty")
    private String lastName;
    @Email(message="Enter valid email")
    private String email;
    private String phoneNums;
    private String doj;
    private Long salary;
}
