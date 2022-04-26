package com.example.Spring.Transactional.controller;

import com.example.Spring.Transactional.dto.EmployeeRequestDTO;
import com.example.Spring.Transactional.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

  @Autowired
  private EmployeeService employeeService;

  @PostMapping("/employee")
  public String save(@RequestBody EmployeeRequestDTO dto) {
    return employeeService.save(dto);
  }
}
