package com.example.bibliotecareactiva.application.useCaseImp.useCaseQueryImp;

import com.example.bibliotecareactiva.application.mappers.ResourceMapper;
import com.example.bibliotecareactiva.application.useCase.usecaseQueryInterface.FindByAuthor;
import com.example.bibliotecareactiva.domain.dto.ResourceDTO;
import com.example.bibliotecareactiva.domain.repository.ResourceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.util.List;

@RequiredArgsConstructor
@Service
public class FindByAuthorUseCase implements FindByAuthor {

    private final ResourceRepository resourceRepository;
    private final ResourceMapper resourceMapper;

    @Override
    public Flux<List<ResourceDTO>> findByAuthor(String author) {
        return null;
    }
}
