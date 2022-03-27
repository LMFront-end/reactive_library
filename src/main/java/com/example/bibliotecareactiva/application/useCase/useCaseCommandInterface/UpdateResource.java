package com.example.bibliotecareactiva.application.useCase.useCaseCommandInterface;

import com.example.bibliotecareactiva.domain.dto.ResourceDTO;
import reactor.core.publisher.Mono;

public interface UpdateResource {
    Mono<ResourceDTO> updateResource(ResourceDTO resourceDTO);
}

