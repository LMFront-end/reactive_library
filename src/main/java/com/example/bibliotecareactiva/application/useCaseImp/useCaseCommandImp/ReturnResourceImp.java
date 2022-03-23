package com.example.bibliotecareactiva.application.useCaseImp.useCaseCommandImp;

import com.example.bibliotecareactiva.application.mappers.ResourceMapper;
import com.example.bibliotecareactiva.application.useCase.useCaseCommandInterface.ReturnResource;
import com.example.bibliotecareactiva.domain.repository.ResourceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Service
public class ReturnResourceImp implements ReturnResource {

    private final ResourceRepository resourceRepository;
    private final ResourceMapper resourceMapper;

    @Override
    public Mono<String> returnResource(String id) {
        return null;
    }
}
