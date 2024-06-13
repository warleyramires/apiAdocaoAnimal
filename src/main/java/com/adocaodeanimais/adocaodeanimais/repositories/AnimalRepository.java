package com.adocaodeanimais.adocaodeanimais.repositories;

import com.adocaodeanimais.adocaodeanimais.entities.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalRepository extends JpaRepository<Animal, Long> {
}
