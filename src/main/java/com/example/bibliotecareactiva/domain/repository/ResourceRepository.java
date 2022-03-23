package com.example.bibliotecareactiva.domain.repository;

import com.example.bibliotecareactiva.domain.collections.Resource;
import com.example.bibliotecareactiva.domain.valueObject.Availability;
import com.example.bibliotecareactiva.domain.valueObject.ThematicArea;
import com.example.bibliotecareactiva.domain.valueObject.TypeOfResource;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Optional;

public interface ResourceRepository extends ReactiveMongoRepository<Resource, String> {

    // find by availability
    Flux<List<Resource>> findAllByAvailability(Availability availability);

    // optional findByIdAndAvailability
    Mono<Optional<Resource>> findByIdAndAvailability(String id, Availability availability);

    // recommend By ThematicArea
    Flux<List<Resource>> findAllByThematicAreaOrderByName(ThematicArea thematicArea);

    // recommend By TypeOfResource
    Flux<List<Resource>>  findAllByTypeOfResourceOrderByName(TypeOfResource typeOfResource);

    // recommend by both (ThematicArea, TypeOfResource
    Flux<List<Resource>> findAllByThematicAreaAndTypeOfResourceOrderByName(ThematicArea thematicArea, TypeOfResource typeOfResource);

    // find By Author
    Flux<List<Resource>> findAllByAuthorContainingIgnoreCaseOrderByName(String author);

    // find by name
    Flux<List<Resource>> findAllByNameContainingIgnoreCaseOrderByName(String author);
}
