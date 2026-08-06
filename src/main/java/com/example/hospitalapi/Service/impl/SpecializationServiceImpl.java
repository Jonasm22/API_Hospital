package com.example.hospitalapi.Service.impl;

import com.example.hospitalapi.DTO.request.SpecialityRequestDTO;
import com.example.hospitalapi.DTO.response.SpecialityResponseDTO;
import com.example.hospitalapi.Model.Status;
import com.example.hospitalapi.Service.SpecializationService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public class SpecializationServiceImpl implements SpecializationService {
    @Override
    public SpecialityResponseDTO createSpecialization(SpecialityRequestDTO requestDTO) {
        return null;
    }

    @Override
    public SpecialityResponseDTO updateSpecialization(Long id, SpecialityRequestDTO requestDTO) {
        return null;
    }

    @Override
    public SpecialityResponseDTO getSpecializationById(Long id) {
        return null;
    }

    @Override
    public void deleteSpecialization(Long id) {

    }

    @Override
    public Page<SpecialityResponseDTO> listBySpecialization(Pageable pageable) {
        return null;
    }

    @Override
    public Page<SpecialityResponseDTO> searchSpecializationByName(String name, Pageable pageable) {
        return null;
    }

    @Override
    public Page<SpecialityResponseDTO> getListByStatus(Status status, Pageable pageable) {
        return null;
    }
}
