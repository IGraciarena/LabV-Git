package com.clase06042020.utn.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity //dice que va a ser una tabla para jpa
@NoArgsConstructor // un constructor vacio
@AllArgsConstructor // un constructor con todos los atributos
@Data //getters setters equals y hashcode
//@EqualsAndHashCode @ToString
@Builder
public class Person {

    @Id //primary key
    @GeneratedValue //es como el auto increment
    private Integer id;

    @NotNull // tenes que pasarle si o si en los parametros
    private String name;

    @NotNull
    private String lastname;

    private int salary;

    /*
    @OneToMany(mappedBy = "car_id")
    private List<Car> carList;
    */

    //todo
    //agregar edad y hacer un filter con edad
    //https://programacion.net/articulo/patrones_de_diseno_iii_patrones_de_creacion_builder_1002
    /*
    public Person setName(String name){
        this.name=name;
        return this;
    } BUILDER




    */
}
