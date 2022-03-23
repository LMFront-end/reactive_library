package com.example.bibliotecareactiva.application.useCase.UsecaseQueryInterface;

import com.example.bibliotecareactiva.domain.dto.ResourceDTO;
import com.example.bibliotecareactiva.domain.valueObject.ThematicArea;
import reactor.core.publisher.Flux;

import java.util.List;

public interface RecommendByThematicArea {
    public Flux<List<ResourceDTO>> recommendByThematicArea(ThematicArea thematicArea);
}
