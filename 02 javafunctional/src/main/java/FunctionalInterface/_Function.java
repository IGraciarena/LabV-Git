package FunctionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        //// imperative mode
        int increment = incrementByOne(1);
        System.out.println(increment);
        int increment2 = incrementByOneFunction.apply(1);
        System.out.println(increment2);

        // functional mode
        int  multipleBy10Function  = multiplyBy10Function.apply(increment2);
        System.out.println(multipleBy10Function);
        // combine multiple functions
        Function<Integer, Integer> addBy1AndThenMultiplyBy10 =
                incrementByOneFunction.andThen(multiplyBy10Function);
        System.out.println(addBy1AndThenMultiplyBy10.apply(1));
        // BIFUNCTION insted of function instead of 1 inpunt it takes 2 inputs and return 1 output
        System.out.println(
                incrementByOneAndMultiply(4,100)
        );
        // functional mode BI
        System.out.println(
                incrementByOneAndMultiplyBiFunction.apply(4,100)
        );



    }

    //increment a number by 1 with methods and with <<inteface Function>>

    // imperative mode
    static int incrementByOne(int number){
        return number + 1;
    }
    static int incrementByOneAndMultiply(int number,int numToMultiplyBy){
        return (number+1)*numToMultiplyBy;
    }
    // functional mode
    static Function<Integer,Integer>incrementByOneFunction = number -> number + 1;
    static Function<Integer,Integer>multiplyBy10Function = number -> number*10;
    // functiona mode BI
    static BiFunction<Integer,Integer,Integer>incrementByOneAndMultiplyBiFunction =
            (numberToIncrementByOne,numberToMultiplyBy)
                    -> (numberToIncrementByOne+1)*numberToMultiplyBy;



}
