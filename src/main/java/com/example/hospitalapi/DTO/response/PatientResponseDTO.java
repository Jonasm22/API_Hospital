package com.example.hospitalapi.DTO.response;

import com.example.hospitalapi.Model.Role;
import com.example.hospitalapi.Model.State;
import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class PatientResponseDTO {
    private Long id;
    private Role role;
    private State state;
    private PersonResponseDTO personResponseDTO;
}

