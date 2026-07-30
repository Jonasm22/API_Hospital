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
public class DoctorSpecialityRequestDTO {


    @NotBlank(message = "employee is required")
    private Long employeeId;

    @NotNull(message = "speciality id is required")
    private Long specialityId;
}

