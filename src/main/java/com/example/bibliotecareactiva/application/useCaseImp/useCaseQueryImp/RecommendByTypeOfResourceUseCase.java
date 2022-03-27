package com.example.bibliotecareactiva.application.useCaseImp.useCaseQueryImp;

import com.example.bibliotecareactiva.application.mappers.ResourceMapper;
import com.example.bibliotecareactiva.application.useCase.usecaseQueryInterface.RecommendByTypeOfResource;
import com.example.bibliotecareactiva.domain.dto.ResourceDTO;
import com.example.bibliotecareactiva.domain.repository.ResourceRepository;
import com.example.bibliotecareactiva.domain.valueObject.TypeOfResource;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@RequiredArgsConstructor
@Service
public class RecommendByTypeOfResourceUseCase implements RecommendByTypeOfResource {

    private final ResourceRepository resourceRepository;
    private final ResourceMapper resourceMapper;

    @Override
    public Flux<ResourceDTO> recommendByTypeOfResource(TypeOfResource typeOfResource) {
        return resourceRepository.findAllByTypeOfResourceOrderByName(typeOfResource)
                .map(resourceMapper.mapToDTO());
    }
}
