package com.example.bibliotecareactiva.application.mappers;

import com.example.bibliotecareactiva.domain.collections.Resource;
import com.example.bibliotecareactiva.domain.dto.ResourceDTO;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class ResourceMapper {

    // Resource to ResourceDTO
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

    // ResourceDTO to Resource
    public Function<ResourceDTO, Resource> mapToCollection(){

        return resourceDTO -> new Resource(
                resourceDTO.getId(),
                resourceDTO.getName(),
                resourceDTO.getAuthor(),
                resourceDTO.getAvailability(),
                resourceDTO.getLastBorrowed(),
                resourceDTO.getThematicArea(),
                resourceDTO.getTypeOfResource()
        );
    }
}
