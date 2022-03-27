package com.example.bibliotecareactiva.infrastructure.resource_query_Router;

import com.example.bibliotecareactiva.application.useCaseImp.useCaseQueryImp.FindByAuthorUseCase;
import com.example.bibliotecareactiva.domain.dto.ResourceDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class FindByAuthorRouter {

    @Bean
    public RouterFunction<ServerResponse> findByAuthorRouterFunction(FindByAuthorUseCase findByAuthorUseCase){
        return route(GET("api/resources/author/{author}"),
                request -> ServerResponse.ok()
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(BodyInserters.fromPublisher(findByAuthorUseCase
                                .findByAuthor(request.pathVariable("author")), ResourceDTO.class))
        );
    }
}
