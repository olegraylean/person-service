package com.rayn_microservices.person_service.repository;

import com.rayn_microservices.person_service.model.Actor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface ActorRepository extends JpaRepository<Actor, UUID> {
  List<Actor> findByFirstNameContainingIgnoreCase(String firstName);
}