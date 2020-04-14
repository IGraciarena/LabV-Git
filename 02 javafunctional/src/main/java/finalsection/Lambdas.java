package finalsection;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Lambdas {
    public static void main(String[] args) {

        Function<String,String>upperCaseName= name ->{
            if (name.isBlank()) throw new IllegalArgumentException("");
            return name.toUpperCase();
        };

        BiFunction<String,Integer,String> upperCaseNameAndAge= (name,age) ->{
            if (name.isBlank())throw new IllegalArgumentException("");
            System.out.println(age);
            return name.toUpperCase();
        };


        System.out.println(upperCaseName.apply("Alex"));


        System.out.println(upperCaseNameAndAge.apply("Alex",20));


    }
}
