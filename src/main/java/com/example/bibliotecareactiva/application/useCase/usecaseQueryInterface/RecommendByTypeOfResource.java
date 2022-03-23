package com.example.bibliotecareactiva.application.useCase.usecaseQueryInterface;

import com.example.bibliotecareactiva.domain.dto.ResourceDTO;
import com.example.bibliotecareactiva.domain.valueObject.TypeOfResource;
import reactor.core.publisher.Flux;

import java.util.List;

@FunctionalInterface
public interface RecommendByTypeOfResource {
    public Flux<List<ResourceDTO>> recommendByTypeOfResource(TypeOfResource typeOfResource);
}
