package com.example.hospitalapi.DTO.request;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class AuthLoginRequestDTO {

    @NotBlank(message = "User is required")
    private String user;
    @NotBlank(message = "Password is required")
    private String password;

}

