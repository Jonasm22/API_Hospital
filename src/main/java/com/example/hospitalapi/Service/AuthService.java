package com.example.hospitalapi.Service;

import com.example.hospitalapi.DTO.request.AuthLoginRequestDTO;
import com.example.hospitalapi.DTO.request.AuthRegisterRequestDTO;
import com.example.hospitalapi.DTO.response.AuthResponseDTO;
import com.example.hospitalapi.DTO.response.MessageResponseDTO;

public interface AuthService {

    MessageResponseDTO register(AuthRegisterRequestDTO request);
    AuthResponseDTO login(AuthLoginRequestDTO requestDTO);

}
