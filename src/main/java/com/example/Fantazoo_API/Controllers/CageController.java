package com.example.Fantazoo_API.Controllers;

import com.example.Fantazoo_API.Models.Cage;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/cc")
public class CageController {
    private final CageController cc;

    CageController(CageController ccController) {
        this.cc = ccController;
    }

    @GetMapping()
    List<Cage> getCages()
    {
        return cc.getCages();
    }

    @GetMapping("/id/{id}")
    Cage getCageById(@PathVariable int id)
    {
        return cc.getCageById(id);
    }

    @PostMapping()
    void insertCage(@RequestBody Cage cage)
    {
        cc.insertCage(cage);
    }

    @PutMapping()
    void updateCage(@RequestBody Cage cage)
    {
        cc.updateCage(cage);
    }

    @DeleteMapping("/id")
    void deleteCage(@PathVariable int id)
    {
        cc.deleteCage(id);
    }
}
