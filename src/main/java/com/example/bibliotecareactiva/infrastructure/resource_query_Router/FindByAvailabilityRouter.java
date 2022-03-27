package com.example.bibliotecareactiva.infrastructure.resource_query_Router;

import com.example.bibliotecareactiva.application.useCaseImp.useCaseQueryImp.FindByAvailabilityUseCase;
import com.example.bibliotecareactiva.domain.dto.ResourceDTO;
import com.example.bibliotecareactiva.domain.valueObject.Availability;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class FindByAvailabilityRouter {

    @Bean
    public RouterFunction<ServerResponse> findByAvailabilityRouterFunction(FindByAvailabilityUseCase findByAvailabilityUseCase){
        return route(GET("api/resources/availability/{availability}"),
                request -> ServerResponse.ok()
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(BodyInserters.fromPublisher(findByAvailabilityUseCase
                                .findByAvailability(Availability.valueOf(request
                                        .pathVariable("availability"))), ResourceDTO.class))
        );
    }
}
