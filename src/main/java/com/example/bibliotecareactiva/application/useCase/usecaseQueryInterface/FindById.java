package com.example.bibliotecareactiva.application.useCase.usecaseQueryInterface;

import com.example.bibliotecareactiva.domain.dto.ResourceDTO;
import reactor.core.publisher.Mono;

import java.util.Optional;

@FunctionalInterface
public interface FindById {
    public Mono<Optional<ResourceDTO>> findById(String id);
}
