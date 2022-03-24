package com.example.bibliotecareactiva.application.useCaseImp.useCaseCommandImp;

import com.example.bibliotecareactiva.application.mappers.ResourceMapper;
import com.example.bibliotecareactiva.application.useCase.useCaseCommandInterface.SaveAllData;
import com.example.bibliotecareactiva.domain.dto.ResourceDTO;
import com.example.bibliotecareactiva.domain.repository.ResourceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class SaveAllDataUseCase implements SaveAllData {

    private final ResourceRepository resourceRepository;
    private final ResourceMapper resourceMapper;

    @Override
    public Flux<ResourceDTO> fillData(List<ResourceDTO> resources) {
        return resourceRepository.saveAll(resources.stream()
                .map(resourceMapper.mapToNewCollection())
                .collect(Collectors.toList()))
                .map(resourceMapper.mapToDTO());
    }
}
