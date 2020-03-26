package com.company;

import java.net.StandardSocketOptions;

public class Main {

    public static void main(String[] args) {
        Contenedor<Caramelo> c1 = new Contenedor<Caramelo>();
        Caramelo c00 = new Caramelo("sugus",40);
        Caramelo c0 = new Caramelo("plinpaff",30);
        Caramelo c2 = new Caramelo("gomitas",70);
        Caramelo c3 = new Caramelo("palito de la selva",35);
        Caramelo c4 = new Caramelo("sugus max",33);

        c1.add(c00);
        c1.add(c0);
        c1.add(c2);
        c1.add(c3);

        System.out.println(c0.compareTo(c2));

        System.out.println(c1.exists(c4));
        System.out.println(c1.getMax());
        System.out.println(c1.getMin());




    }
}
