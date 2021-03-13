package com.galvanize.cognizant.Cyptozoology.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/zoo")

public class ZooController {
    @PostMapping("/animal")
    @ResponseStatus(HttpStatus.CREATED)
    public void postAnimal(){


    }

    @GetMapping("/animal")
    @ResponseStatus(HttpStatus.OK)
    public void getAnimal(){

    }

}
