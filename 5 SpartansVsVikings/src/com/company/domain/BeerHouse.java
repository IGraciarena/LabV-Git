package com.company.domain;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class BeerHouse {

    List<Human>humanList;
    public BeerHouse(){
        humanList = new ArrayList<>();
    }

    public synchronized void oneVSOne(){

    }

    public synchronized void gotoBathroom(){

    }

    public List<Human> sortByWeight(){
        return this.humanList.stream()
                .sorted(Comparator.comparing(Human::getWeight))
                .collect(Collectors.toList());
    }


}
