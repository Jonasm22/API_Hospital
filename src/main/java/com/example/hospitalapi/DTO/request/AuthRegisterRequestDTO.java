package com.example.hospitalapi.DTO.request;

import com.example.hospitalapi.Model.Role;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class AuthRegisterRequestDTO {
    @NotNull(message = "person id is required")
    private Long personId;
    @NotBlank(message = "User is required")
    private String user;
    @NotBlank(message = "Password is required")
    private String password;
    @NotNull(message = "Role is required")
    private Role role;




}

