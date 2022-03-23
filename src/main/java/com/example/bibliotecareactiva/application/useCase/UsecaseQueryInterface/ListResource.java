package com.example.bibliotecareactiva.application.useCase.UsecaseQueryInterface;

import com.example.bibliotecareactiva.domain.dto.ResourceDTO;
import reactor.core.publisher.Flux;

import java.util.List;

public interface ListResource {
    public Flux<List<ResourceDTO>> listResource();
}
