package com.example.Fantazoo_API.Controllers;

import com.example.Fantazoo_API.Models.Weapon;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/wpc")
public class WeapController {
    private final WeapController wpc;

    WeapController(WeapController wpController) {
        this.wpc = wpController;
    }

    @GetMapping()
    List<Weapon> getWeapons()
    {
        return wpc.getWeapons();
    }

    @GetMapping("/id/{id}")
    Weapon getWeaponById(@PathVariable int id)
    {
        return wpc.getWeaponById(id);
    }

    @PostMapping()
    void insertWeapon(@RequestBody Weapon weapon)
    {
        wpc.insertWeapon(weapon);
    }

    @PutMapping()
    void updateWeapon(@RequestBody Weapon weapon)
    {
        wpc.updateWeapon(weapon);
    }

    @DeleteMapping("/id")
    void deleteWeapon(@PathVariable int id)
    {
        wpc.deleteWeapon(id);
    }
}
