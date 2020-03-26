package com.company;

import java.util.LinkedList;
import java.util.List;

public class Pila <T>{
    private List<T>list;

    public Pila(){
        list = new LinkedList<T>();
    }

    public void pop(){
        ((LinkedList)list).getFirst();
    }
    public void push (T t1){
        list.add(t1);
    }
    public void size(){
        list.size();
    }

    public void removeLast(){
        ((LinkedList)list).removeLast();
    }
}
