package com.galvanize.cognizant.Cyptozoology.service;


import com.galvanize.cognizant.Cyptozoology.model.AnimalDTO;
import com.galvanize.cognizant.Cyptozoology.model.AnimalEntity;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class AnimalServiceTest {

    @Mock
    AnimalRepository mockAnimalRepository;

    @InjectMocks
    AnimalService subject;

    @Test
    public void createAnimal() {
        AnimalDTO animalDTO = new AnimalDTO("Cat", "Walking");
        subject.create(animalDTO);

        verify(mockAnimalRepository).save(
                new AnimalEntity("Cat", "Walking")
        );

    }
}
