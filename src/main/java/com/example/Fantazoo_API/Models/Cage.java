package com.example.Fantazoo_API.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cage {
    @Id
    int id;
    String name;

    @OneToMany(mappedBy = "cage")
    List<Zookeeper> zookeepers;

    @OneToOne
    Animal animal;

}
