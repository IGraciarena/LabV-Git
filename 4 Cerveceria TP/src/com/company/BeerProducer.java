package com.company;

public class BeerProducer extends Thread{

    int beerCrafted;
    boolean keepGoing =true;
    BeerHouse beerHouse;
    double price;

    public BeerProducer(int beerCrafted,BeerHouse beerHouse){
        this.beerCrafted=beerCrafted;
        this.beerHouse=beerHouse;
        this.price=beerCrafted*0.5;
    }

//    // this is for the client (beerhouse) in some point would like to choose the amount of galons/litres he want for his pub.
//    // esto es para que el cliente (beerhouse) en algun momento pueda elegir el la cantidad de litros de birra que quiere
//    private void setBeerCrafted(int amount){
//        this.beerCrafted=amount;
//    }

    public int getBeerCrafted() {
        return beerCrafted;
    }

    @Override
    public void run(){
       while (keepGoing){
           beerHouse.refill(this);
       }
    }
}
