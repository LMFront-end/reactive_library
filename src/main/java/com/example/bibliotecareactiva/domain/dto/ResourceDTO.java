package com.example.bibliotecareactiva.domain.dto;

import com.example.bibliotecareactiva.domain.valueObject.Availability;
import com.example.bibliotecareactiva.domain.valueObject.ThematicArea;
import com.example.bibliotecareactiva.domain.valueObject.TypeOfResource;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResourceDTO {

    private String id;

    @NotBlank
    private String name;

    @NotBlank
    private String author;

    private Availability availability;
    private LocalDate lastBorrowed;
    private ThematicArea thematicArea;
    private TypeOfResource typeOfResource;
}
