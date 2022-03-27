package com.example.bibliotecareactiva.infrastructure.resource_command_routers;

import com.example.bibliotecareactiva.application.useCaseImp.useCaseCommandImp.BorrowResourceUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.PUT;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class BorrowResourceRouter {

    @Bean
    public RouterFunction<ServerResponse> borrowResourceRouterFunction(BorrowResourceUseCase borrowResourceUseCase){
        return route(PUT("api/resource/borrow/{id}"),
                request -> ServerResponse.ok()
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(BodyInserters.fromPublisher(borrowResourceUseCase
                                .borrowResource(request.pathVariable("id")), String.class))
        );
    }
}
