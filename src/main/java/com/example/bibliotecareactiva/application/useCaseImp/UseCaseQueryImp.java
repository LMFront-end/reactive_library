package com.example.bibliotecareactiva.application.useCaseImp;

import com.example.bibliotecareactiva.application.useCase.UseCaseQueryInterface;
import com.example.bibliotecareactiva.domain.dto.ResourceDTO;
import com.example.bibliotecareactiva.domain.valueObject.Availability;
import com.example.bibliotecareactiva.domain.valueObject.ThematicArea;
import com.example.bibliotecareactiva.domain.valueObject.TypeOfResource;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Optional;

public class UseCaseQueryImp implements UseCaseQueryInterface {
    @Override
    public Flux<List<ResourceDTO>> listResource() {
        return null;
    }

    @Override
    public Mono<Optional<ResourceDTO>> findById(String id) {
        return null;
    }

    @Override
    public Flux<List<ResourceDTO>> findByAvailability(Availability availability) {
        return null;
    }

    @Override
    public Flux<List<ResourceDTO>> recommendByThematicArea(ThematicArea thematicArea) {
        return null;
    }

    @Override
    public Flux<List<ResourceDTO>> recommendByTypeOfResource(TypeOfResource typeOfResource) {
        return null;
    }

    @Override
    public Flux<List<ResourceDTO>> recommendThematicAreaAndTypeOfResource(ThematicArea thematicArea, TypeOfResource typeOfResource) {
        return null;
    }

    @Override
    public Flux<List<ResourceDTO>> findByAuthor(String author) {
        return null;
    }

    @Override
    public Flux<List<ResourceDTO>> findByName(String name) {
        return null;
    }
}
