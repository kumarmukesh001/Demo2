package com.copilot.rest.service.impl;

import com.copilot.rest.requsest.dto.EmployeeRequest;
import com.copilot.rest.response.dto.EmployeeResponse;
import com.copilot.rest.service.EmployeeRest;
import com.copilot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeRestImpl implements EmployeeRest {

    @Autowired
    EmployeeService employeeService;

    @Override
    public EmployeeResponse getEmployeeById(Long id) {
        return employeeService.getEmployeeById(id);
    }

    @Override
    public List<EmployeeResponse> getAllEmployeeList() {
        return employeeService.getAllEmployeeList();
    }

    @Override
    public EmployeeResponse createEmployee(EmployeeRequest employeeRequest) {
        return employeeService.createEmployee(employeeRequest);
    }

    @Override
    public EmployeeResponse updateEmployee(Long id, EmployeeRequest employeeRequest) {
        return employeeService.updateEmployee(id, employeeRequest);
    }

    @Override
    public ResponseEntity deleteEmployee(Long id) {
        return employeeService.deleteEmployee(id);
    }
}
