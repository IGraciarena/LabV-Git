package com.company;

import java.util.ArrayList;
import java.util.List;

public class BeerHouse {

    private static int limit = 100;
    int stock;
    private boolean available = false;

    public BeerHouse(int stock){
        this.stock=stock;
    }

    public int getStock() {
        return stock;
    }

    public synchronized void refill(BeerProducer beerProducer){
        while (!available){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if (stock<10){
            stock= stock+(beerProducer.getBeerCrafted());
            System.out.println("El productor ah entregado :" +beerProducer.getBeerCrafted());
            System.out.println("Hay un total de :" +stock+" cervezas");

        }
        available=false;
        notifyAll();

    }

    public synchronized void drinkBeer(BeerConsumer beerConsumer){
        while (available) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        stock = (stock)-(beerConsumer.getBeersThatsGonnaDrink());
        System.out.println("el consumidor consumio: "+beerConsumer.getBeersThatsGonnaDrink());
        available = true;
        notifyAll();
    }





}
