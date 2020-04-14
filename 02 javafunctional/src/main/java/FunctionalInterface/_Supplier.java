package FunctionalInterface;

import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        // imperative mode
        System.out.println(getDBConnectionUrl());
        // functional mode
        System.out.println(getDBConnectionUrlSupplier.get());

    }
    // imperative mode
    static String getDBConnectionUrl(){
        return "jdbc://localhost:8080/users";
    }
    // functional mode
    static Supplier<String>getDBConnectionUrlSupplier = ()
            -> "jdbc://localhost:8080/users";

}
