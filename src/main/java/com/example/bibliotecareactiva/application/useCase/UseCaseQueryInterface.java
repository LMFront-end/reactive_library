package com.example.bibliotecareactiva.application.useCase;

import com.example.bibliotecareactiva.domain.dto.ResourceDTO;
import com.example.bibliotecareactiva.domain.valueObject.Availability;
import com.example.bibliotecareactiva.domain.valueObject.ThematicArea;
import com.example.bibliotecareactiva.domain.valueObject.TypeOfResource;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Optional;


public interface UseCaseQueryInterface {

    /* GET */

    // find by id


    // find by availability
    Flux<List<ResourceDTO>> findByAvailability(Availability availability);

    // recommend By ThematicArea
    Flux<List<ResourceDTO>> recommendByThematicArea(ThematicArea thematicArea);

    // recommend By TypeOfResource
    Flux<List<ResourceDTO>> recommendByTypeOfResource(TypeOfResource typeOfResource);

    // recommend by both (ThematicArea, TypeOfResource)
    Flux<List<ResourceDTO>> recommendThematicAreaAndTypeOfResource(ThematicArea thematicArea, TypeOfResource typeOfResource);

    // find By Author
    Flux<List<ResourceDTO>> findByAuthor(String author);

    // find by name
    Flux<List<ResourceDTO>> findByName(String name);
}
