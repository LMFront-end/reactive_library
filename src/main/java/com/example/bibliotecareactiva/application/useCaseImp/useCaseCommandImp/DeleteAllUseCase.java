package com.example.bibliotecareactiva.application.useCaseImp.useCaseCommandImp;

import com.example.bibliotecareactiva.application.mappers.ResourceMapper;
import com.example.bibliotecareactiva.application.useCase.useCaseCommandInterface.DeleteAll;
import com.example.bibliotecareactiva.domain.repository.ResourceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Service
public class DeleteAllUseCase implements DeleteAll {

    private final ResourceRepository resourceRepository;

    @Override
    public Mono<Void> deleteAll() {
        return resourceRepository.deleteAll();
    }
}
