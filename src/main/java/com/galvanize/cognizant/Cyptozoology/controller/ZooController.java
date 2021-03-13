package com.galvanize.cognizant.Cyptozoology.controller;

import com.galvanize.cognizant.Cyptozoology.model.Animaldto;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/zoo")
public class ZooController {

    ArrayList<Animaldto> animallist;

    public ZooController(){
        animallist = new ArrayList<Animaldto>();
    }

    @PostMapping("/animals")
    @ResponseStatus(HttpStatus.CREATED)
    public void postAnimal(@RequestBody Animaldto animal){
        animallist.add(animal);
    }

    @GetMapping("/animals")
    @ResponseStatus(HttpStatus.OK)
    public ArrayList<Animaldto> getAnimal(){
      return animallist;
    }
}
