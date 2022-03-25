package com.example.bibliotecareactiva.infrastructure.resourceCommandRouter;

import com.example.bibliotecareactiva.application.useCaseImp.useCaseCommandImp.DeleteAllUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.BodyInserter;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.DELETE;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class DeleteAllRouter {

    @Bean
    public RouterFunction<ServerResponse> DeleteAllRouterFunction(DeleteAllUseCase deleteAllUseCase){
        return route(
                DELETE("/api/delete_all"),
                request -> ServerResponse.ok()
                        .body(BodyInserters.fromPublisher(deleteAllUseCase.deleteAll(),Void.class))
        );
    }
}
