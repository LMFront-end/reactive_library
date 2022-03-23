package com.example.bibliotecareactiva.application.useCase.useCaseCommandInterface;

import com.example.bibliotecareactiva.domain.dto.ResourceDTO;
import reactor.core.publisher.Flux;

import java.util.List;

@FunctionalInterface
public interface SaveAllData {
    public Flux<ResourceDTO> fillData(List<ResourceDTO> resourceDTOS);
}
