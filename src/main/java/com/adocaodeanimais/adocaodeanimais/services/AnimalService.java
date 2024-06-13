package com.adocaodeanimais.adocaodeanimais.services;

import com.adocaodeanimais.adocaodeanimais.entities.Animal;
import com.adocaodeanimais.adocaodeanimais.repositories.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalService {

    @Autowired
    private AnimalRepository animalRepository;

    public List<Animal> listarTodos(){
        return animalRepository.findAll();
    }

    public Animal buscarAnimal(Long id){
        return animalRepository.findById(id).orElse(null);
    }

    public Animal salvar(Animal animal){
        return animalRepository.save(animal);
    }

    public void deletar(Long id){
        animalRepository.deleteById(id);
    }

}
