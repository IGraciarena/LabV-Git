package com.company;

public class Main {

    public static void main(String[] args) {

        // productor =  me duermo esperando a que me llamen
        //              si me llaman produzco 100 y me duermo
        // consumidor = si hay birra resto 3 al stock o un random mas adelante
        //              si no hay tarta despierto al productor y me duermo .produzco

        BeerHouse beerHouse = new BeerHouse(60,3);

        BeerConsumer b1 = new BeerConsumer(beerHouse);
        BeerConsumer b2 = new BeerConsumer(beerHouse);
        BeerConsumer b3 = new BeerConsumer(beerHouse);
        BeerConsumer b4 = new BeerConsumer(beerHouse);
        BeerConsumer b5 = new BeerConsumer(beerHouse);

        BeerProducer bp1 = new BeerProducer(50,beerHouse);
        bp1.start();
        b1.start();
        b2.start();
        b3.start();
        b4.start();
        b5.start();

        try {
            b2.sleep(100000000);
            b3.sleep(120000000);
            b4.sleep(130000000);
            b5.sleep(140000000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
