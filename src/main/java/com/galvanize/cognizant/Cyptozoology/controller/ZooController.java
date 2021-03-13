package com.galvanize.cognizant.Cyptozoology.controller;

import com.galvanize.cognizant.Cyptozoology.model.AnimalDTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/zoo")
public class ZooController {

    ArrayList<AnimalDTO> animalList;

    public ZooController(){
        animalList = new ArrayList<AnimalDTO>();
    }

    @PostMapping("/animals")
    @ResponseStatus(HttpStatus.CREATED)
    public void postAnimal(@RequestBody AnimalDTO animal){
        animalList.add(animal);
    }

    @GetMapping("/animals")
    @ResponseStatus(HttpStatus.OK)
    public ArrayList<AnimalDTO> getAnimal(){
      return animalList;
    }
}
