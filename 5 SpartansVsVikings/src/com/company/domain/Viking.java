package com.company.domain;

public class Viking extends Human {
    static int extraTolerance = 4;
    boolean keepGoing = true;

    public Viking(Integer id,String name, int age, int weight) {
        super(id,name, age, weight);
    }

    public Viking() { }

    public int getExtraTolerance() {
        return extraTolerance;
    }

    public void setExtraTolerance(int extraTolerance) {
        Viking.extraTolerance = extraTolerance;
    }

    @Override
    Integer drink() {
        return this.iDrink.drink();
    }

    @Override
    Integer pee() {
        return this.iPee.pee();
    }

    @Override
    public String toString() {
        return super.toString()+
                " extraTolerance: " + extraTolerance;
    }

    @Override
    public void run() {
        while(keepGoing){

        }
    }
}
