package com.example.hospitalapi.Service;

import com.example.hospitalapi.DTO.request.EmployeeRequestDTO;
import com.example.hospitalapi.DTO.response.EmployeeResponseDTO;
import com.example.hospitalapi.Model.Status;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface EmployeeeService {
    EmployeeResponseDTO createEmployee(EmployeeRequestDTO requestDTO);
    Page<EmployeeResponseDTO> getListAllEmployee(Pageable pageable);
    Page<EmployeeResponseDTO> getListByStatus(Status status , Pageable pageable);
    EmployeeResponseDTO updateEmployee(Long id, EmployeeRequestDTO dto);
    void deleteEmployeeById(Long id);
    Optional<EmployeeResponseDTO> searchById(Long id);
}
