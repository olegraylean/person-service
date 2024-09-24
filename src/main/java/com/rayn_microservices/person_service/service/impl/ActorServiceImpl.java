package com.rayn_microservices.person_service.service.impl;

import com.rayn_microservices.person_service.model.Actor;
import com.rayn_microservices.person_service.repository.ActorRepository;
import com.rayn_microservices.person_service.service.ActorService;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ActorServiceImpl implements ActorService {
  private final ActorRepository actorRepository;

  public ActorServiceImpl(ActorRepository actorRepository) {
    this.actorRepository = actorRepository;
  }

  @Override
  public Actor findByUUID(UUID uuid) {
    return actorRepository.getById(uuid);
  }
  @Override
  public List<Actor> findByName(String name) {
    return actorRepository.findByFirstNameContainingIgnoreCase(name);
  }

  @Override
  public Actor saveActor(Actor actor) {
    return actorRepository.save(actor);
  }
}
