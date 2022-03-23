package com.example.bibliotecareactiva.application.useCase.usecaseQueryInterface;

import com.example.bibliotecareactiva.domain.dto.ResourceDTO;
import reactor.core.publisher.Flux;

import java.util.List;

@FunctionalInterface
public interface ListResource {
    public Flux<List<ResourceDTO>> listResource();
}
