package com.example.Fantazoo_API.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Zookeeper {
    @Id
    int id;
    String name;

    @OneToOne(mappedBy = "zookeeper")
    Weapon weapon;

    @ManyToOne
    Cage cage;
}
