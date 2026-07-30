package com.example.hospitalapi.DTO.request;

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
public class SpecialityRequestDTO {

    @NotBlank(message = "user is required")
    private String user;

    @NotNull(message = "State is required")
    private State state;


}

