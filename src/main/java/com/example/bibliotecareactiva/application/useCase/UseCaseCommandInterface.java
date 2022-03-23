package com.example.bibliotecareactiva.application.useCase;

import com.example.bibliotecareactiva.domain.dto.ResourceDTO;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public interface UseCaseCommandInterface {

    /* DELETE */

    // Delete Resource


    // Delete All
    Mono<Void> deleteById(String id);
}
