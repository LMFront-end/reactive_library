package com.example.bibliotecareactiva.infrastructure.resource_query_Router;

import com.example.bibliotecareactiva.application.useCaseImp.useCaseQueryImp.RecommendByThematicAreaUseCase;
import com.example.bibliotecareactiva.domain.dto.ResourceDTO;
import com.example.bibliotecareactiva.domain.valueObject.ThematicArea;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class RecommendByThematicAreaRouter {

    @Bean
    public RouterFunction<ServerResponse> recommendByThematicAreaRouterFunction(RecommendByThematicAreaUseCase recommendByThematicAreaUseCase){
        return route(GET("api/resources/thematic/{thematic}"),
                request -> ServerResponse.ok()
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(BodyInserters.fromPublisher(recommendByThematicAreaUseCase
                                .recommendByThematicArea(ThematicArea
                                        .valueOf(request.pathVariable("thematic"))), ResourceDTO.class)
                        )
        );
    }
}
