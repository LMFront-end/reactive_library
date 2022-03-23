package com.example.bibliotecareactiva.application.useCase.usecaseQueryInterface;

import com.example.bibliotecareactiva.domain.dto.ResourceDTO;
import com.example.bibliotecareactiva.domain.valueObject.ThematicArea;
import com.example.bibliotecareactiva.domain.valueObject.TypeOfResource;
import reactor.core.publisher.Flux;

import java.util.List;

@FunctionalInterface
public interface ThematicAreaAndTypeOfResource {
    public Flux<List<ResourceDTO>> recommendThematicAreaAndTypeOfResource(ThematicArea thematicArea, TypeOfResource typeOfResource);
}
