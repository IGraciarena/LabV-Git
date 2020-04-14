package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Person>people= getPeople();

        //todo Imperative Approach : you define every single steap for what you want to achieve
        //     example : Filter down every single female from our list

//        List<Person> females = new ArrayList<>();
//        for (Person person : females){
//            if(person.getGender().equals(Gender.FEMALE)){
//                females.add(person);
//            }
//        }
//        females.forEach(System.out::println);

        //todo Declarative Approach: we have a few methods from java streams
        //                           streams is made for collections works REALLY well
        //                           stream = abstraction

        //todo                  FILTER method
        //Filter takes a "Predicate" simply gets a true or false
        //We have to collect the result of the filter
        //And when you collect you should get all the data into another List
        List<Person> mujeres = people.stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .collect(Collectors.toList());
        mujeres.forEach(System.out::println);

        //todo                 SORT method
        //the Sorted always take a Comparator and
        //the Comparator has the comparing method by the thing you want to
        //finally "Collect" the data with a list
        List<Person> sortByAge = people.stream()
                .sorted(Comparator.comparing(Person::getAge))
                .collect(Collectors.toList());
        sortByAge.forEach(System.out::println);

        //todo          SORT & COMPARING BY methods
        List<Person> sortByAgeAndGender = people.stream()
                .sorted(Comparator.comparing(Person::getAge)
                .thenComparing(Person::getGender))
                .collect(Collectors.toList());
        sortByAgeAndGender.forEach(System.out::println);

        //todo                 ALLMATCH method
        //We wanna know if the people from the list has age more than 5
        //We gonna have a Predicate that gonna return a boolean
        boolean allMatch = people.stream()
                .allMatch(person -> person.getAge() > 11);
        System.out.println(allMatch);
//      this gonna throw false because Ellen has 12 and im comparing all the list

        //todo                  ANYMATCH method
        //If you can simply want to know if there is at least 1
        boolean anyMatch = people.stream()
                .anyMatch(person -> person.getAge() > 30);
        System.out.println(anyMatch);

        //todo                 NONEMATCH method
        /// if you want to know if someone names "antonio"
        boolean noneMatch = people.stream()
                .noneMatch(person -> person.getName().equals("Ivan"));
        System.out.println(noneMatch);
        // this is gonna say false cause is the oposite because of "none" method

        //todo                     MAX method
        //you can get the max number or the max value between a collection

        //we can do it with the optional class and return a null or the person
        Optional<Person> personOptional = people.stream()
                .max(Comparator.comparing(Person::getAge));

        // or we can simply return with a printline
        people.stream()
                .max(Comparator.comparing(Person::getAge))
                .ifPresent(person -> {
                    System.out.println(person);
                });
        // Same metodology with the min
        //todo                    MIN method
        people.stream()
                .min(Comparator.comparing(Person::getAge))
                .ifPresent(person -> {
                    System.out.println(person);
                });

        //we gonna expect a map collection with a gender and a list for the gender
        //we use the groupingby() of the Collectors class to group by gender
        Map<Gender, List<Person>> genderListMap = people.stream()
                .collect(Collectors.groupingBy(Person::getGender));
        //to show the collection
        genderListMap.forEach((gender, people1) -> {
            System.out.println(gender);
            people1.forEach(System.out::println);
        });

        //an example of what you can do with stream library
        //todo FILTER method: you can filter people by their gender
        //     MAX method: you can get the oldest person of that filter
        //     MAP method: you can return the name of that person
        //all together
        Optional<String> oldestFemaleAge = people.stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .max(Comparator.comparing(Person::getAge))
                .map(Person::getName);
        oldestFemaleAge.ifPresent(System.out::println);




    }
     private static List<Person> getPeople() {
        return List.of(
                new Person("Ivan", 25, Gender.MALE),
                new Person("Juan", 30, Gender.MALE),
                new Person("Jorge", 50, Gender.MALE),
                new Person("Sabrina", 25, Gender.FEMALE),
                new Person("Ellen", 12, Gender.FEMALE),
                new Person("Angel", 32, Gender.MALE),
                new Person("Britney", 40, Gender.FEMALE)
        );
    }
}

