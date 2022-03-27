package com.example.bibliotecareactiva.infrastructure.resource_command_routers;

import com.example.bibliotecareactiva.application.useCaseImp.useCaseCommandImp.ReturnResourceUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.PUT;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

public class ReturnResourceRouter {

    @Bean
    public RouterFunction<ServerResponse> returnResourceRouterFunction(ReturnResourceUseCase returnResourceUseCase){
        return route(PUT("api/resource/return/{id}"),
                request -> ServerResponse.ok()
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(BodyInserters.fromPublisher(returnResourceUseCase
                                .returnResource(request.pathVariable("id")), String.class))
        );
    }
}
