package com.example.hospitalapi.DTO.response;

import com.example.hospitalapi.Model.Status;
import lombok.*;


@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class SpecialityResponseDTO {
    private Long id;
    private String name;
    private Status status;

}

