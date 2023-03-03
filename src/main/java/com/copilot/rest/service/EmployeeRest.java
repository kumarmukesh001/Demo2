package com.copilot.rest.service;

import com.copilot.rest.requsest.dto.EmployeeRequest;
import com.copilot.rest.response.dto.EmployeeResponse;
import com.copilot.twilio.SmsRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public interface EmployeeRest {
    @GetMapping("/employee/{id}")
    EmployeeResponse getEmployeeById(@PathVariable Long id);
    @GetMapping("/employee/all")
    List<EmployeeResponse> getAllEmployeeList() ;

    @PostMapping("/employee")
    EmployeeResponse createEmployee(@RequestBody EmployeeRequest employeeRequest);

    @PutMapping("/employee/{id}")
    EmployeeResponse updateEmployee(@PathVariable Long id, @RequestBody EmployeeRequest employeeRequest);

    @DeleteMapping("/employee/{id}")
    ResponseEntity deleteEmployee(Long id);

    @PostMapping("/employee/{id}/sendSms")
    void sendSms(@Valid @RequestBody SmsRequest smsRequest) ;
}
