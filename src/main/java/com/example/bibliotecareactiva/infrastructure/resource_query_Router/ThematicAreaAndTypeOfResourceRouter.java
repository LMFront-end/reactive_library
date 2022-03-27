package com.example.bibliotecareactiva.infrastructure.resource_query_Router;

import com.example.bibliotecareactiva.application.useCaseImp.useCaseQueryImp.ThematicAreaAndTypeOfResourceUseCase;
import com.example.bibliotecareactiva.domain.dto.ResourceDTO;
import com.example.bibliotecareactiva.domain.valueObject.ThematicArea;
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
public class ThematicAreaAndTypeOfResourceRouter {

    @Bean
    public RouterFunction<ServerResponse> thematicAreaAndTypeOfResourceRouterFunction(ThematicAreaAndTypeOfResourceUseCase thematicAreaAndTypeOfResourceUseCase){
        return route(GET("api/resources/thematic/{thematic}/type/{type}"),
                request -> ServerResponse.ok()
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(BodyInserters.fromPublisher(thematicAreaAndTypeOfResourceUseCase
                                .recommendThematicAreaAndTypeOfResource(ThematicArea.valueOf(request.pathVariable("thematic")),
                                        TypeOfResource.valueOf(request.pathVariable("type"))), ResourceDTO.class)
                        )
        );
    }
}
