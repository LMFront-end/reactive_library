package com.example.bibliotecareactiva.infrastructure.resourceCommandRouter;

import com.example.bibliotecareactiva.application.useCaseImp.useCaseCommandImp.SaveAllDataUseCase;
import com.example.bibliotecareactiva.domain.dto.ResourceDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.BodyInserter;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import java.util.List;
import java.util.stream.Collectors;

import static org.springframework.web.reactive.function.server.RequestPredicates.POST;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class SaveAllDataRouter {

    @Bean
    public RouterFunction<ServerResponse> saveAllDataRouterFunction(SaveAllDataUseCase saveAllDataUseCase){

        return route(POST("/api/fill_data").and(accept(MediaType.APPLICATION_JSON)),

                request -> request.bodyToMono(new ParameterizedTypeReference<List<ResourceDTO>>() {})
                        .flatMapMany(saveAllDataUseCase::fillData)
                        .collect(Collectors.toList())
                        .flatMap(response -> ServerResponse.ok()
                                .contentType(MediaType.APPLICATION_JSON)
                                .bodyValue(response)
                        )
        );
    }

}
