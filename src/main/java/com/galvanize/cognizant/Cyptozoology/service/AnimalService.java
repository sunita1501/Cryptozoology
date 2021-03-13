package com.galvanize.cognizant.Cyptozoology.service;

import com.galvanize.cognizant.Cyptozoology.model.AnimalDTO;
import com.galvanize.cognizant.Cyptozoology.model.AnimalEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnimalService {

    private final AnimalRepository animalRepository;

    @Autowired
    public AnimalService(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    public void create(AnimalDTO animalDTO) {
        animalRepository.save(new AnimalEntity(animalDTO.getName(), animalDTO.getType()));
    }
}
