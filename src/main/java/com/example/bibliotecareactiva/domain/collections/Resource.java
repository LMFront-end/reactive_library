package com.example.bibliotecareactiva.domain.collections;

import com.example.bibliotecareactiva.domain.valueObject.Availability;
import com.example.bibliotecareactiva.domain.valueObject.ThematicArea;
import com.example.bibliotecareactiva.domain.valueObject.TypeOfResource;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Data
@Document(value = "resources")
public class Resource {

    @Id
    private final String id;

    private final String name;
    private final String author;
    private final Availability availability;
    private final LocalDate lastBorrowed;
    private final ThematicArea thematicArea;
    private final TypeOfResource typeOfResource;
}
