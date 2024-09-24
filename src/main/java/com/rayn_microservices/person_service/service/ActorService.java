package com.rayn_microservices.person_service.service;

import com.rayn_microservices.person_service.model.Actor;

import java.util.List;
import java.util.UUID;

public interface ActorService {

  Actor findByUUID(UUID uuid);

  List<Actor> findByName(String name);

  Actor saveActor(Actor actor);
}
