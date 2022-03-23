package com.example.bibliotecareactiva.application.useCase.usecaseQueryInterface;

import com.example.bibliotecareactiva.domain.dto.ResourceDTO;
import com.example.bibliotecareactiva.domain.valueObject.Availability;
import reactor.core.publisher.Flux;

import java.util.List;

@FunctionalInterface
public interface FindByAvailability {
    public Flux<List<ResourceDTO>> findByAvailability(Availability availability);
}
