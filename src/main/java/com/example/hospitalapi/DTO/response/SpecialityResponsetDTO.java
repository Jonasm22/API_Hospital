package com.example.hospitalapi.DTO.response;

import com.example.hospitalapi.Model.State;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.*;


@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class SpecialityResponsetDTO {
    private Long id;
    private String name;
    private State state;

}

