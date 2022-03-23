package com.example.bibliotecareactiva.application.useCaseImp.useCaseCommandImp;

import com.example.bibliotecareactiva.application.mappers.ResourceMapper;
import com.example.bibliotecareactiva.application.useCase.useCaseCommandInterface.BorrowResource;
import com.example.bibliotecareactiva.domain.repository.ResourceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Service
public class BorrowResourceImp implements BorrowResource {

    private final ResourceRepository resourceRepository;
    private final ResourceMapper resourceMapper;

    @Override
    public Mono<String> borrowResource(String id) {
        return null;
    }
}
