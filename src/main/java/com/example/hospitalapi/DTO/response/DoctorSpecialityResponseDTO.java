package com.example.hospitalapi.DTO.response;

import com.example.hospitalapi.Model.Employee;
import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class DoctorSpecialityResponseDTO {
    private Long id;
    private EmployeeResponseDTO employeeResponseDTO;
    private SpecialityResponsetDTO specialityResponsetDTO;
}

