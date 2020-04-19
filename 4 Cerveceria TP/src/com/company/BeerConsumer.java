package com.company;

import java.util.Random;

public class BeerConsumer extends Thread {

    Integer beersThatsGonnaDrink;
    BeerHouse beerHouse;
    boolean keepGoing=true;
    double money;

    public BeerConsumer (BeerHouse beerHouse){
        beersThatsGonnaDrink = (int) (Math.random() * 10 + 1);
        this.beerHouse=beerHouse;
        money = (Math.random()*60+1);
    }

    public double getMoney() {
        return money;
    }

    public int getBeersThatsGonnaDrink() {
        return beersThatsGonnaDrink;
    }

    @Override
    public void  run( ){
        while (keepGoing){
            beerHouse.drinkBeer(this);
        }

    }
}
