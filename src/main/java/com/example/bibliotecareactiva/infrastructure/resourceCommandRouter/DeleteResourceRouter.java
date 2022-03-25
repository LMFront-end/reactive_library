package com.example.bibliotecareactiva.infrastructure.resourceCommandRouter;

import com.example.bibliotecareactiva.application.useCaseImp.useCaseCommandImp.DeleteResourceUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.BodyInserter;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.DELETE;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class DeleteResourceRouter {

    @Bean
    public RouterFunction<ServerResponse> DeleteResourceRouterFunction(DeleteResourceUseCase deleteResourceUseCase){
        return route(
                DELETE("/api/delete_resource/{id}"),
                request -> ServerResponse.ok()
                        .body(BodyInserters.fromPublisher(deleteResourceUseCase.deleteById((request.pathVariable("id"))),
                                Void.class)
                        )
        );
    }
}
