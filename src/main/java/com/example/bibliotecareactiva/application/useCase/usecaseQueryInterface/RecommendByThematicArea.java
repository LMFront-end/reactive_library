package com.example.bibliotecareactiva.application.useCase.usecaseQueryInterface;

import com.example.bibliotecareactiva.domain.dto.ResourceDTO;
import com.example.bibliotecareactiva.domain.valueObject.ThematicArea;
import reactor.core.publisher.Flux;

import java.util.List;

@FunctionalInterface
public interface RecommendByThematicArea {
    public Flux<ResourceDTO> recommendByThematicArea(ThematicArea thematicArea);
}
