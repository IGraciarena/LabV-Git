package com.clase06042020.utn.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;


//probando one to many para tener muchos autos en una persona.

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Car {

    @Id
    private Integer id;

    private String name;

}
