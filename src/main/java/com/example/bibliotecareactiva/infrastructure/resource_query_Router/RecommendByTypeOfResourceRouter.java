package com.example.bibliotecareactiva.infrastructure.resource_query_Router;

import com.example.bibliotecareactiva.application.useCaseImp.useCaseQueryImp.RecommendByTypeOfResourceUseCase;
import com.example.bibliotecareactiva.domain.dto.ResourceDTO;
import com.example.bibliotecareactiva.domain.valueObject.TypeOfResource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class RecommendByTypeOfResourceRouter {

    @Bean
    public RouterFunction<ServerResponse> recommendByTypeOfResourceRouterFunction(RecommendByTypeOfResourceUseCase recommedByTypeOfResourceUseCase){
        return route(GET("api/resources/type/{type}"),
                request -> ServerResponse.ok()
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(BodyInserters.fromPublisher(recommedByTypeOfResourceUseCase
                                .recommendByTypeOfResource(TypeOfResource
                                        .valueOf(request.pathVariable("type"))), ResourceDTO.class)
                        )
        );
    }
}
