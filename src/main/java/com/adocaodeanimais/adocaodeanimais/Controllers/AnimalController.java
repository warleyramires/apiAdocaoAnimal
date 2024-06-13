package com.adocaodeanimais.adocaodeanimais.Controllers;

import com.adocaodeanimais.adocaodeanimais.entities.Animal;
import com.adocaodeanimais.adocaodeanimais.services.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/animais")
public class AnimalController {
    @Autowired
    private AnimalService animalService;

    @GetMapping
    public List<Animal> listarTodos(){
        return animalService.listarTodos();
    }

    @PostMapping
    public Animal salvar(@RequestBody Animal animal){
        return animalService.salvar(animal);
    }

    @GetMapping("/{id}")
    public Animal buscarAnimal(@PathVariable Long id){
        return animalService.buscarAnimal(id);
    }

    @DeleteMapping("/{id}")
    public void deletarAnimal(@PathVariable Long id){
        animalService.deletar(id);
    }

}
