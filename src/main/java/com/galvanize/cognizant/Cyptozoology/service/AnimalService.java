package com.galvanize.cognizant.Cyptozoology.service;

import com.galvanize.cognizant.Cyptozoology.model.AnimalDTO;
import com.galvanize.cognizant.Cyptozoology.model.AnimalEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

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


    public List<AnimalDTO> getAllanimals() {

        List<AnimalEntity> animalentities = animalRepository.findAll();
        return animalentities.stream().map(animal -> {
            return new AnimalDTO(animal.getName(), animal.getType());
        }).collect(Collectors.toList());


    }
}
