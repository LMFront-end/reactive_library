package com.example.bibliotecareactiva.application.useCase.useCaseCommandInterface;

import reactor.core.publisher.Mono;

@FunctionalInterface
public interface ReturnResource {
    public Mono<String> returnResource(String id);
}
