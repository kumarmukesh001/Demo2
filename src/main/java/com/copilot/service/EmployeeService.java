package com.copilot.service;

import com.copilot.rest.requsest.dto.EmployeeRequest;
import com.copilot.rest.response.dto.EmployeeResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {
    EmployeeResponse getEmployeeById(Long id);

    List<EmployeeResponse> getAllEmployeeList();

    EmployeeResponse createEmployee(EmployeeRequest employeeRequest);

    EmployeeResponse updateEmployee(Long id, EmployeeRequest employeeRequest);

    ResponseEntity deleteEmployee(Long id);
}
