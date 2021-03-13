package com.galvanize.cognizant.Cyptozoology.service;

import com.galvanize.cognizant.Cyptozoology.model.AnimalEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRepository extends JpaRepository<AnimalEntity, Long> {
}
