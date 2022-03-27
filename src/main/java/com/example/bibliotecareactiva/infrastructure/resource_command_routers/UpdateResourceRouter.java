package com.example.bibliotecareactiva.infrastructure.resource_command_routers;

import com.example.bibliotecareactiva.application.useCaseImp.useCaseCommandImp.UpdateResourceUseCase;
import com.example.bibliotecareactiva.domain.dto.ResourceDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.PUT;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class UpdateResourceRouter {

    @Bean
    public RouterFunction<ServerResponse> updateResourceRouterFunction(UpdateResourceUseCase updateResourceUseCase){

        return route(PUT("/api/update_resource")
                        .and(accept(MediaType.APPLICATION_JSON)),
                request -> request.bodyToMono(ResourceDTO.class)
                        .flatMap(updateResourceUseCase::updateResource)
                        .flatMap(result -> ServerResponse.ok()
                                .contentType(MediaType.APPLICATION_JSON)
                                .bodyValue(result)
                        )
        );
    }
}
