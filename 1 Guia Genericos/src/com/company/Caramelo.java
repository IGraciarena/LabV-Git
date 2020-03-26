package com.company;

public class Caramelo implements Comparable {

    private String name;
    private float price;

    public Caramelo(String name,float price){
        this.name=name;
        this.price=price;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    @Override
    public int compareTo(Object o) {
        int rta = 0;
        if (((Caramelo)o).price == this.price){
            rta= 0;
        }
        else{
            if(((Caramelo)o).price < this.price){
                rta=1;
            }
            else{
                rta=-1;
            }
        }
        return rta;
    }


    @Override
    public String toString() {
        return "Caramelo{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
