package com.company;

import java.util.Random;

public class BeerConsumer extends Thread {

    Integer beersThatsGonnaDrink;
    BeerHouse beerHouse;

    public BeerConsumer (BeerHouse beerHouse){
        beersThatsGonnaDrink = (int) (Math.random() * 10 + 1);
        this.beerHouse=beerHouse;
    }

    public int getBeersThatsGonnaDrink() {
        return beersThatsGonnaDrink;
    }

    @Override
    public void  run( ){
        while (true){
            beerHouse.drinkBeer(this);
        }

    }
}
