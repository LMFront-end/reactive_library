package com.example.bibliotecareactiva.application.mappers;

import com.example.bibliotecareactiva.domain.collections.Resource;
import com.example.bibliotecareactiva.domain.dto.ResourceDTO;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class ResourceMapper {

    public Function<Resource, ResourceDTO> mapToDTO(){
        return resource -> new ResourceDTO(
                resource.getId(),
                resource.getName(),
                resource.getAuthor(),
                resource.getAvailability(),
                resource.getLastBorrowed(),
                resource.getThematicArea(),
                resource.getTypeOfResource()
        );

    }
}
