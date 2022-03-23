package com.example.bibliotecareactiva.application.useCaseImp.useCaseQueryImp;

import com.example.bibliotecareactiva.application.mappers.ResourceMapper;
import com.example.bibliotecareactiva.application.useCase.usecaseQueryInterface.RecommendByThematicArea;
import com.example.bibliotecareactiva.domain.dto.ResourceDTO;
import com.example.bibliotecareactiva.domain.repository.ResourceRepository;
import com.example.bibliotecareactiva.domain.valueObject.ThematicArea;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.util.List;

@RequiredArgsConstructor
@Service
public class RecommendByThematicAreaImp implements RecommendByThematicArea {

    private final ResourceRepository resourceRepository;
    private final ResourceMapper resourceMapper;

    @Override
    public Flux<List<ResourceDTO>> recommendByThematicArea(ThematicArea thematicArea) {
        return null;
    }
}
