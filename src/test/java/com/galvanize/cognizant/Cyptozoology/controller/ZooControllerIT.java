package com.galvanize.cognizant.Cyptozoology.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@SpringBootTest
@AutoConfigureMockMvc

public class ZooControllerIT {
    @Autowired
    MockMvc mockmvc;

    @Test
    public void postAnimal() throws Exception {

        mockmvc.perform(post("/zoo/animal")).andExpect(status().isCreated());


    }
}
