package com.example.bibliotecareactiva.application.useCase.useCaseCommandInterface;

import reactor.core.publisher.Mono;

public interface DeleteAll {
    Mono<Void> deleteAll();
}
