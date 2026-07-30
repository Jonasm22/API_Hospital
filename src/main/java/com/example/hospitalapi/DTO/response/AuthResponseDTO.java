package com.example.hospitalapi.DTO.response;


import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class AuthResponseDTO {

    private String message;
    private String token;
    private String tokenType;

    public AuthResponseDTO(String message) {
        this.message = message;
    }

    public AuthResponseDTO(String token, String tokenType) {
        this.token = token;
        this.tokenType = tokenType;
        this.message = "Loggin success";
    }
}

