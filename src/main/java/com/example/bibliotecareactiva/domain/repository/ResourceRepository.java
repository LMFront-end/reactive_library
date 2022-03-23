package com.example.bibliotecareactiva.domain.repository;

import com.example.bibliotecareactiva.domain.collections.Resource;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ResourceRepository extends ReactiveMongoRepository<Resource, String> {
}
