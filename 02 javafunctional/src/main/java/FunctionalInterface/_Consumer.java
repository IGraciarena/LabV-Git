package FunctionalInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        // Normal java Function
        Customer maria = new Customer("Maria","991");
        greetCostumer(maria);

        // Consumer Functional interface
        greetCustumerConsumer.accept(maria);

        // the BI version of Consumer "BiConsumer"
        greetCustumerConsumerV2.accept(maria,true);


    }
    //functional mode
    static int incrementByOneAndMultiply(int number,int numToMultiplyBy){
        return (number+1)*numToMultiplyBy;
    }
    //functional mode BI
    static BiConsumer<Customer,Boolean>greetCustumerConsumerV2 = (customer, showPhoneNumber) ->
        System.out.println("Hellow" + customer.customerName +
                ", thanks for register phone number"
                + (showPhoneNumber ? customer.customerPhoneNumber : "****"));
    //functional mode
    static Consumer<Customer>greetCustumerConsumer = customer ->
            System.out.println("Hellow"+customer.customerName+
                    ", thanks for register phone number"
                    +customer.customerPhoneNumber);
    //imperative mode
    static void greetCostumer(Customer customer){
        System.out.println("Hellow"+customer.customerName+
                ", thanks for register phone number"
                +customer.customerPhoneNumber);
    }

    static class Customer{
        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }

    }
}
