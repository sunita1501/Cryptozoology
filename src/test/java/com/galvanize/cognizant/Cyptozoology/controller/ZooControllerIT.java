package com.galvanize.cognizant.Cyptozoology.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.galvanize.cognizant.Cyptozoology.model.Animaldto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;


@SpringBootTest
@AutoConfigureMockMvc

public class ZooControllerIT {
    @Autowired
    MockMvc mockmvc;
    @Autowired
    ObjectMapper objectmapper;

    @Test
    public void postAnimal() throws Exception {
        Animaldto animaldto = new Animaldto("Dog","Walking");

        mockmvc.perform(post("/zoo/animal")
        .content(objectmapper.writeValueAsString(animaldto))

                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isCreated());

        mockmvc.perform(get("/zoo/animal")).andExpect(status().isOk())
                .andExpect(jsonPath("[0].name").value("Dog"))
                .andExpect(jsonPath("[0].type").value("Walking"));


    }
}
