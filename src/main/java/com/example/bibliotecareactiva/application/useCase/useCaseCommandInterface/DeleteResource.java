package com.example.bibliotecareactiva.application.useCase.useCaseCommandInterface;

import reactor.core.publisher.Mono;

@FunctionalInterface
public interface DeleteResource {
    Mono<Void> deleteById(String id);
}
