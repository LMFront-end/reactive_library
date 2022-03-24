package com.example.bibliotecareactiva.infrastructure.resourceCommandRouter;

import com.example.bibliotecareactiva.application.useCaseImp.useCaseCommandImp.SaveResourceUseCase;
import com.example.bibliotecareactiva.domain.dto.ResourceDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.POST;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class SaveResourceRouter {

    @Bean
    public RouterFunction<ServerResponse> SaveResourceRouterFunction(SaveResourceUseCase saveResourceUseCase){
        return route(POST("/api/save_resource")
                .and(accept(MediaType.APPLICATION_JSON)), request -> request.bodyToMono(ResourceDTO.class)
                .flatMap(saveResourceUseCase::saveResource)
                .flatMap(result -> ServerResponse.ok()
                        .contentType(MediaType.APPLICATION_JSON)
                        .bodyValue(result)
                )
        );
    }
}
