package com.example.hospitalapi.DTO.request;

import com.example.hospitalapi.Model.Role;
import com.example.hospitalapi.Model.State;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode

public class EmployeeRequestDTO {

    @NotNull(message = "person id is required")
    private Long personId;

    @NotNull(message = "Role is required")
    private Role role;

    @NotNull(message = "State is required")
    private State state;


}

