package com.example.Fantazoo_API.Controllers;

import com.example.Fantazoo_API.Models.Zookeeper;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/zkc")
public class ZKController {
    private final ZKController zkc;

    ZKController(ZKController zkController) {
        this.zkc = zkController;
    }

    @GetMapping()
    List<Zookeeper> getAllZookeepers()
    {
       return zkc.getAllZookeepers();
    }

    @GetMapping("/id/{id}")
    Zookeeper getZookeeperById(@PathVariable int id)
    {
        return zkc.getZookeeperById(id);
    }

    @PostMapping()
    void insertZookeeper(@RequestBody Zookeeper zookeeper)
    {
        zkc.insertZookeeper(zookeeper);
    }

    @PutMapping()
    void updateZookeeper(@RequestBody Zookeeper zookeeper)
    {
        zkc.updateZookeeper(zookeeper);
    }

    @DeleteMapping("/id")
    void deleteZookeeper(@PathVariable int id)
    {
        zkc.deleteZookeeper(id);
    }
}
