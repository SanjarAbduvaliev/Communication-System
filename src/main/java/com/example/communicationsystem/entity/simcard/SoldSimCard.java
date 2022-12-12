package com.example.communicationsystem.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

//Sotilgan sim kartalar
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class SoldSimCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToMany
    private Set<Branch> branches;//filiallarda sotilgan sim kartalar

    @OneToMany
    private Set<SimCard> simCards;

}
