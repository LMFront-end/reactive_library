package com.example.bibliotecareactiva.application.useCaseImp.useCaseCommandImp;

import com.example.bibliotecareactiva.application.mappers.ResourceMapper;
import com.example.bibliotecareactiva.application.useCase.useCaseCommandInterface.BorrowResource;
import com.example.bibliotecareactiva.domain.repository.ResourceRepository;
import com.example.bibliotecareactiva.domain.valueObject.Availability;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Service
public class BorrowResourceUseCase implements BorrowResource {

    private final ResourceRepository resourceRepository;
    private final ResourceMapper resourceMapper;

    @Override
    public Mono<String> borrowResource(String id) {
        return resourceRepository.findById(id)
                .flatMap(r -> r.getAvailability().equals(Availability.AVAILABLE) ?
                        resourceRepository.save(resourceMapper
                                        .mapToCollection().apply(resourceMapper.mapToDTOWhenBorrow().apply(r)))
                                .thenReturn("Recurso prestado exitosamente")
                        : Mono.just("El recurso no se encuentra disponible")
                ).switchIfEmpty(Mono.just("El recurso no pudo ser encontrado"));
    }
}
