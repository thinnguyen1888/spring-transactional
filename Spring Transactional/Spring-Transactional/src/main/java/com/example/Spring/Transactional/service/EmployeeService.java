package com.example.Spring.Transactional.service;

import com.example.Spring.Transactional.dao.DepartmentDao;
import com.example.Spring.Transactional.dao.EmployeeDao;
import com.example.Spring.Transactional.dto.EmployeeRequestDTO;
import com.example.Spring.Transactional.entity.Department;
import com.example.Spring.Transactional.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class EmployeeService {

  @Autowired
  private EmployeeDao employeeDao;

  @Autowired
  private DepartmentDao departmentDao;

  @Transactional //Gắn vào để đảm bảo tính toàn vẹn của dữ liệu
  public String save(EmployeeRequestDTO dto) {
    Department department = new Department();
    department.setName(dto.getDepartmentName());
    department.setCode(dto.getDepartmentName());

    Long departmentId = departmentDao.save(department).getId();

    Employee employee = null;
    employee.setName(dto.getEmpName());
    employee.setEmail(dto.getEmail());
    employee.setDepartmentId(departmentId);

    employeeDao.save(employee);

    return "Employee is saved with Employee ID :" + employee.getId();
  }
}
