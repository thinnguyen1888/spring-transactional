package com.example.Spring.Transactional.controller;

import com.example.Spring.Transactional.dto.EmployeeRequestDTO;
import com.example.Spring.Transactional.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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

  @GetMapping("/test1")
  public Long test1() {
    Long x = null;
    return x += 10;
  }

  @GetMapping("/test2")
  public Integer test2() {
    int[] numbers = new int[]{1, 2, 3, 4, 5};
    int lastNumber = numbers[6];
    return lastNumber;
  }
}
