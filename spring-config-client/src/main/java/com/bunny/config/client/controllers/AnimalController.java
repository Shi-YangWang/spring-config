package com.bunny.config.client.controllers;

import com.bunny.config.client.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnimalController {

    @Autowired
    private AnimalService animalService;

    @GetMapping("/animal/query")
    public String queryAnimal() {
        return animalService.getPort() + ", " + animalService.getId();
    }
}
