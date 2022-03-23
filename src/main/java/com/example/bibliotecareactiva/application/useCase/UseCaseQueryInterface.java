package com.example.bibliotecareactiva.application.useCase;

import com.example.bibliotecareactiva.domain.dto.ResourceDTO;
import com.example.bibliotecareactiva.domain.valueObject.Availability;
import com.example.bibliotecareactiva.domain.valueObject.ThematicArea;
import com.example.bibliotecareactiva.domain.valueObject.TypeOfResource;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Optional;


public interface UseCaseQueryInterface {

    // find By Author


    // find by name
    Flux<List<ResourceDTO>> findByName(String name);
}
