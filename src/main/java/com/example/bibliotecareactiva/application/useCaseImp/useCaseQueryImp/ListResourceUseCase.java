package com.example.bibliotecareactiva.application.useCaseImp.useCaseQueryImp;

import com.example.bibliotecareactiva.application.mappers.ResourceMapper;
import com.example.bibliotecareactiva.application.useCase.usecaseQueryInterface.ListResource;
import com.example.bibliotecareactiva.domain.dto.ResourceDTO;
import com.example.bibliotecareactiva.domain.repository.ResourceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ListResourceUseCase implements ListResource {

    private final ResourceRepository resourceRepository;
    private final ResourceMapper resourceMapper;

    @Override
    public Flux<ResourceDTO> listResource() {
        return resourceRepository.findAll()
                .map(resourceMapper.mapToDTO());
    }
}
