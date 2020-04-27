package com.company.domain;

public class Spartan extends Human {

    private int professionalDrinker;
    public boolean keepGoing = true;

    public Spartan(Integer id,String name, int age, int weight) {
        super(id,name, age, weight);
    }

    public Spartan() {
    }

    @Override
    Integer drink() {
        return this.iDrink.drink();
    }

    @Override
    Integer pee() {
        return this.iPee.pee();
    }

    public int getProfessionalDrinker() {
        return professionalDrinker;
    }

    public void setProfessionalDrinker(int professionalDrinker) {
        this.professionalDrinker = professionalDrinker;
    }

    @Override
    public String toString() {
        return super.toString()+
                " professionalDrinker: " + professionalDrinker;
    }

    @Override
    public void run() {
        while(keepGoing){

        }
    }
}
