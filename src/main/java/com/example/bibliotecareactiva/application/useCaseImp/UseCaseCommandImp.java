package com.example.bibliotecareactiva.application.useCaseImp;

import com.example.bibliotecareactiva.application.useCase.UseCaseCommandInterface;
import com.example.bibliotecareactiva.domain.dto.ResourceDTO;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public class UseCaseCommandImp implements UseCaseCommandInterface {

    @Override
    public Flux<ResourceDTO> fillData(List<ResourceDTO> resourceDTOS) {
        return null;
    }

    @Override
    public Mono<ResourceDTO> saveResource(ResourceDTO resourceDTO) {
        return null;
    }

    @Override
    public Mono<ResourceDTO> updateResource(ResourceDTO resourceDTO) {
        return null;
    }

    @Override
    public Mono<String> borrowResource(String id) {
        return null;
    }

    @Override
    public Mono<String> returnResource(String id) {
        return null;
    }

    @Override
    public Mono<Void> deleteClearData() {
        return null;
    }

    @Override
    public Mono<Void> deleteById(String id) {
        return null;
    }
}
