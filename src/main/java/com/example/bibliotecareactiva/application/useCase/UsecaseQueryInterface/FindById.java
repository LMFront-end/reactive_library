package com.example.bibliotecareactiva.application.useCase.UsecaseQueryInterface;

import com.example.bibliotecareactiva.domain.dto.ResourceDTO;
import reactor.core.publisher.Mono;

import java.util.Optional;

public interface FindById {
    public Mono<Optional<ResourceDTO>> findById(String id);
}
