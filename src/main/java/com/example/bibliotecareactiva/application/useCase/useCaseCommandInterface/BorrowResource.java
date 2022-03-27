package com.example.bibliotecareactiva.application.useCase.useCaseCommandInterface;

import reactor.core.publisher.Mono;

@FunctionalInterface
public interface BorrowResource {
    Mono<String> borrowResource(String id);
}
