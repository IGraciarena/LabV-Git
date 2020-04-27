package com.company.domain;

import com.company.interfaces.iDrink;
import com.company.interfaces.iPee;

public abstract class Human implements Runnable{

    private Integer id;
    private String name;
    private int age;
    private int weight;
    iDrink iDrink;
    iPee iPee;

    public Human(Integer id,String name, int age, int weight) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Human() { }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setiDrink(iDrink iDrink) {
        this.iDrink = iDrink;
    }

    public void setiPee(iPee iPee) {
        this.iPee = iPee;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public iDrink getiDrink() {
        return iDrink;
    }

    public iPee getiPee() {
        return iPee;
    }

    abstract Integer drink();
    abstract Integer pee();

    @Override
    public String toString() {
        return  "\n name: " + name +
                " age: " + age +
                " weight: " + weight+"\n";
    }
}
