package com.example.bibliotecareactiva.application.useCase;

import com.example.bibliotecareactiva.domain.dto.ResourceDTO;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public interface UseCaseCommandInterface {

    // save Resource


    /* PUT */
    // update Resource
    Mono<ResourceDTO> updateResource(ResourceDTO resourceDTO);

    // borrow Resource
    Mono<String> borrowResource(String id);

    // return Resource
    Mono<String> returnResource(String id);

    /* DELETE */

    // Delete Resource
    Mono<Void> deleteClearData();

    // Delete All
    Mono<Void> deleteById(String id);
}
