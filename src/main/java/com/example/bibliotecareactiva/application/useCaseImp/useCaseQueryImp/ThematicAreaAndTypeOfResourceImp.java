package com.example.bibliotecareactiva.application.useCaseImp.useCaseQueryImp;

import com.example.bibliotecareactiva.application.mappers.ResourceMapper;
import com.example.bibliotecareactiva.application.useCase.usecaseQueryInterface.ThematicAreaAndTypeOfResource;
import com.example.bibliotecareactiva.domain.dto.ResourceDTO;
import com.example.bibliotecareactiva.domain.repository.ResourceRepository;
import com.example.bibliotecareactiva.domain.valueObject.ThematicArea;
import com.example.bibliotecareactiva.domain.valueObject.TypeOfResource;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ThematicAreaAndTypeOfResourceImp implements ThematicAreaAndTypeOfResource {

    private final ResourceRepository resourceRepository;
    private final ResourceMapper resourceMapper;

    @Override
    public Flux<List<ResourceDTO>> recommendThematicAreaAndTypeOfResource(ThematicArea thematicArea, TypeOfResource typeOfResource) {
        return null;
    }
}
