package com.example.hospitalapi.Service.impl;

import com.example.hospitalapi.DTO.request.EmployeeRequestDTO;
import com.example.hospitalapi.DTO.response.EmployeeResponseDTO;
import com.example.hospitalapi.Model.Status;
import com.example.hospitalapi.Service.EmployeeeService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public class EmployeeServiceImpl implements EmployeeeService {
    @Override
    public EmployeeResponseDTO createEmployee(EmployeeRequestDTO requestDTO) {
        return null;
    }

    @Override
    public Page<EmployeeResponseDTO> getListAllEmployee(Pageable pageable) {
        return null;
    }

    @Override
    public Page<EmployeeResponseDTO> getListByStatus(Status status, Pageable pageable) {
        return null;
    }

    @Override
    public EmployeeResponseDTO updateEmployee(Long id, EmployeeRequestDTO dto) {
        return null;
    }

    @Override
    public void deleteEmployeeById(Long id) {

    }

    @Override
    public Optional<EmployeeResponseDTO> searchById(Long id) {
        return Optional.empty();
    }
}
