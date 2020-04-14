package finalsection;

import java.util.function.BiFunction;
import java.util.function.Consumer;

public class Callbacks {
    public static void main(String[] args) {

        hello("john",null,value->{
            System.out.println("no lastName provided for " +value);
        });

        hello2("john",
                null,
                ()->{ System.out.println("no last name provided");});
    }

    //todo              CALLBACK IN JAVA FUNCTIONAL
    static void hello(String firstName, String lastName, Consumer<String>callback){
        System.out.println(firstName);
        if (lastName != null){
            System.out.println(lastName);
        }else {
            callback.accept(firstName);
        }
    }
    //todo              CALLBACK IN JAVA FUNCTIONAL
    static void hello2(String firstName, String lastName, Runnable callback){
        System.out.println(firstName);
        if (lastName != null){
            System.out.println(lastName);
        }else {
            callback.run();
        }
    }
}

    //javascript method for callback function
//    function hello(firstName,lastName,callback){
//        console.log(fistName);
//        if(lastname){
//            console.log(lastName)
//        }else{
//            callback();
//        }
//    }
//}
