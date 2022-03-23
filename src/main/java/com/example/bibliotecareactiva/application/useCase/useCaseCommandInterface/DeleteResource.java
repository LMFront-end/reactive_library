package com.example.bibliotecareactiva.application.useCase.useCaseCommandInterface;

import reactor.core.publisher.Mono;

@FunctionalInterface
public interface DeleteResource {
    public Mono<Void> deleteClearData();
}
