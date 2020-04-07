package com.clase06042020.utn.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity //dice que va a ser una tabla para jpa
@NoArgsConstructor // un constructor vacio
@AllArgsConstructor // un constructor con todos los atributos
@Data //getters setters equals y hashcode
//@EqualsAndHashCode @ToString
public class Person {

    @Id //primary key
    @GeneratedValue //es como el auto increment
    private Integer id;

    @NotNull // tenes que pasarle si o si en los parametros
    private String name;

    @NotNull
    private String lastname;

    //todo
    //agregar edad y hacer un filter con edad
}
