package com.company;

import java.util.ArrayList;
import java.util.List;

public class Contenedor <T extends Comparable> {
    private List<T> elements;
    public Contenedor(){
        elements = new ArrayList<T>();
    }

    public void add(T element){
        elements.add(element);
    }


    public int exists(T t1){
        if(elements.contains(t1)){
            return 1;
        }else {
            return 0;
        }
    }

    public T getMax(){
        T rta = this.elements.get(0);
        for (T t1:this.elements) {

            if(rta.compareTo(t1)==1){
                rta= t1;
            }
        }
        return rta;
    }

    public T getMin(){
        T rta = this.elements.get(0);
        for (T t1:this.elements) {
            if(rta.compareTo(t1)==-1){
                rta=t1;
            }
        }
        return rta;
    }

}
