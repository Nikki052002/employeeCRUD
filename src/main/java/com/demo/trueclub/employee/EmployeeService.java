package com.demo.trueclub.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;
    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository)
    {
        this.employeeRepository=employeeRepository;
    }
    public List<Employee> getEmployees(){
        return employeeRepository.findAll();
    }
    public Employee getEmployeeById(int id) {
        return employeeRepository.findById(id).orElse(null);
    }

    public Employee addNewEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee updateEmployee(Employee employee) {
        Employee existingEmployee = employeeRepository.findById(employee.getId()).orElse(null);
        existingEmployee.setName(employee.getName());
        existingEmployee.setAddress(employee.getAddress());
        existingEmployee.setPincode(employee.getPincode());
        existingEmployee.setState(employee.getState());
        return employeeRepository.save(existingEmployee);
    }

    public String deleteEmployee(int id) {
        employeeRepository.deleteById(id);
        return "employee removed";
    }
}
