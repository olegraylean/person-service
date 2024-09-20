package com.rayn_microservices.person_service;

import com.rayn_microservices.person_service.model.Actor;
import com.rayn_microservices.person_service.model.Director;
import com.rayn_microservices.person_service.model.Writer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/persons")
public class PersonController {

  @GetMapping("/actor/{id}")
  public Actor getActor(@PathVariable int id) {
    return new Actor(id, "Tom", "Ford", new Date(), null);
  }

  @GetMapping("/writer/{id}")
  public Writer getWriter(@PathVariable int id) {
    return new Writer();
  }

  @GetMapping("/director/{id}")
  public Director getDirector(@PathVariable int id) {
    return new Director();
  }

  @GetMapping("/director/movie/{movie}")
  public Director getDirector(@PathVariable String movie) {
    return Director.builder().id(1l).fullName("Pitter Dinclage").movie(movie).build();
  }

}