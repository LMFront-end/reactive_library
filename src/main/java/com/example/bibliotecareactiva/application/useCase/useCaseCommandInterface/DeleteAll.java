package com.example.bibliotecareactiva.application.useCase.useCaseCommandInterface;

import reactor.core.publisher.Mono;

public interface DeleteAll {
    public Mono<Void> deleteAll();
}
