package com.copilot.service.impl;

import com.copilot.dao.MoEmployeeRepository;
import com.copilot.dao.model.MoEmployee;
import com.copilot.rest.requsest.dto.EmployeeRequest;
import com.copilot.rest.response.dto.EmployeeResponse;
import com.copilot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    MoEmployeeRepository moEmployeeRepository;
    @Override
    public EmployeeResponse getEmployeeById(Long id) {
        Optional<MoEmployee> moEmployeeOptional =  moEmployeeRepository.findById(id);
        if(moEmployeeOptional.isPresent())
            return convertToEmployeeResponse(moEmployeeOptional.get());
        else
            return null;

    }

    private EmployeeResponse convertToEmployeeResponse(MoEmployee moEmployee) {
        EmployeeResponse employeeResponse = new EmployeeResponse();
        employeeResponse.setId(moEmployee.getId().toString());
        employeeResponse.setName(moEmployee.getName());
        employeeResponse.setEmail(moEmployee.getEmail());
        employeeResponse.setPhone(moEmployee.getPhone());
        return employeeResponse;
    }

    @Override
    public List<EmployeeResponse> getAllEmployeeList() {
        List<EmployeeResponse> response = new ArrayList<>();
       List<MoEmployee> moEmployeeList =  moEmployeeRepository.findAll();
       if(moEmployeeList!=null && moEmployeeList.size()>0 ){
              for(MoEmployee moEmployee : moEmployeeList){
                  response.add(convertToEmployeeResponse(moEmployee));
              }
       }
        return response;
    }

    @Override
    public EmployeeResponse createEmployee(EmployeeRequest employeeRequest) {
        MoEmployee moEmployee =   convertToMoEmployee(employeeRequest);
        moEmployeeRepository.save(moEmployee);

        return convertToEmployeeResponse(moEmployee);
    }

    private MoEmployee convertToMoEmployee(EmployeeRequest employeeRequest) {
        MoEmployee moEmployee = new MoEmployee();
        moEmployee.setName(employeeRequest.getName());
        moEmployee.setEmail(employeeRequest.getEmail());
        moEmployee.setPhone(employeeRequest.getPhone());
        return moEmployee;
    }


    @Override
    public EmployeeResponse updateEmployee(Long id, EmployeeRequest employeeRequest) {
        return null;
    }

    @Override
    public ResponseEntity deleteEmployee(Long id) {
        return null;
    }
}
