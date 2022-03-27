package com.example.bibliotecareactiva.application.useCaseImp.useCaseCommandImp;

import com.example.bibliotecareactiva.application.mappers.ResourceMapper;
import com.example.bibliotecareactiva.application.useCase.useCaseCommandInterface.ReturnResource;
import com.example.bibliotecareactiva.domain.repository.ResourceRepository;
import com.example.bibliotecareactiva.domain.valueObject.Availability;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Service
public class ReturnResourceUseCase implements ReturnResource {

    private final ResourceRepository resourceRepository;
    private final ResourceMapper resourceMapper;

    @Override
    public Mono<String> returnResource(String id) {
        return resourceRepository.findById(id)
                .flatMap(r -> r.getAvailability().equals(Availability.UNAVAILABLE) ?
                        resourceRepository.save(resourceMapper
                                        .mapToCollection().apply(resourceMapper.mapToDTOWhenReturn().apply(r)))
                                .thenReturn("Recurso devuelto exitosamente")
                        : Mono.just("El recurso no se encuentra prestado")
                ).switchIfEmpty(Mono.just("El recurso no pudo ser encontrado"));
    }
}
