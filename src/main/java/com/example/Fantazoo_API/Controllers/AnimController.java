package com.example.Fantazoo_API.Controllers;

import com.example.Fantazoo_API.Models.Animal;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/ac")
public class AnimController {
    private final AnimController ac;

    AnimController(AnimController acController) {
        this.ac = acController;
    }

    @GetMapping()
    List<Animal> getAnimals()
    {
        return ac.getAnimals();
    }

    @GetMapping("/id/{id}")
    Animal getAnimalById(@PathVariable int id)
    {
        return ac.getAnimalById(id);
    }

    @PostMapping()
    void insertAnimal(@RequestBody Animal animal)
    {
        ac.insertAnimal(animal);
    }

    @PutMapping()
    void updateAnimal(@RequestBody Animal animal)
    {
        ac.updateAnimal(animal);
    }

    @DeleteMapping("/id")
    void deleteAnimal(@PathVariable int id)
    {
        ac.deleteAnimal(id);
    }
}
