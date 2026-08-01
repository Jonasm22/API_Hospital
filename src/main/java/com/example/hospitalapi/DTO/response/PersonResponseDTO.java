package com.example.hospitalapi.DTO.response;
import com.example.hospitalapi.Model.Status;
import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor

public class PersonResponseDTO {
    private Long id;
    private String name;
    private String email;
    private Status status;
}

