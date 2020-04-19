package com.company;

import java.util.ArrayList;
import java.util.List;

public class BeerHouse {

    private static int limit = 100;
    int stock;
    private boolean available = false;
    double beerPrice;

    public BeerHouse(int stock,double beerPrice){
        this.stock=stock;
        this.beerPrice=beerPrice;
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
            System.out.println("The BeerProducer has delivered :" +beerProducer.getBeerCrafted());
            System.out.println("There is a total of: " +stock+" beers");

        }
        available=false;
//        notifyAll();

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
        double cost = beerConsumer.getBeersThatsGonnaDrink()*beerPrice;

        System.out.println("The Client drank: "+beerConsumer.getBeersThatsGonnaDrink());
        System.out.println("The Client has to pay: "+cost);

        if (cost<=beerConsumer.getMoney()){
            System.out.println("The Client paid the beer");
        }else {
            System.out.println("The Client has left the bar");
        }

        available = true;
        notifyAll();
    }





}
