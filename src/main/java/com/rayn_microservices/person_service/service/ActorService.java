package com.rayn_microservices.person_service.service;

import com.rayn_microservices.person_service.model.Actor;

import java.util.List;
import java.util.UUID;

public interface ActorService {

  Actor findByUUID(UUID uuid);

  Actor saveActor(Actor actor);

  Actor updateActor(Long id, Actor actor);

  void deleteActor(UUID id);

  List<Actor> searchActorsByNameAndId(String name, UUID id);
}
