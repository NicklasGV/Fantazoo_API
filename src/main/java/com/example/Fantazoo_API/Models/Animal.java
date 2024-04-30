package com.example.Fantazoo_API.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Animal {
    @Id
    int id;
    String name;
    int age;
    String gender;

    @OneToOne(mappedBy = "animal")
    Cage cage;
}
