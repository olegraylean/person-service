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
    return actorRepository.getReferenceById(uuid);
  }

  @Override
  public Actor saveActor(Actor actor) {
    return actorRepository.save(actor);
  }

  @Override
  public Actor updateActor(Long id, Actor actor) {
    return actorRepository.save(actor);
  }

  @Override
  public void deleteActor(UUID id) {
    actorRepository.deleteById(id);
  }

  @Override
  public List<Actor> searchActorsByNameAndId(String name, UUID id) {
    return actorRepository.findByFirstNameContainingIgnoreCaseAndId(name, id);
  }
}
