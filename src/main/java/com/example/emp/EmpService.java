package com.example.emp;

import java.util.List;

public interface EmpService {
    String creatEmployee(Employee employee);
    List<Employee> readEmployees();
    boolean deleteEmployee(Long id);
    String updateEmployee(Long id, Employee employee);
    Employee readEmployee(Long id);
    
}
