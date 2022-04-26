package com.example.Spring.Transactional.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeRequestDTO {

  private String empName;
  private String email;
  private String departmentName;
}
