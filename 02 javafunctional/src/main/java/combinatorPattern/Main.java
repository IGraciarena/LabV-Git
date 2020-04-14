package combinatorPattern;

import java.time.LocalDate;

import static combinatorPattern.CustomerRegistrationValidator.*;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(
                "Alice",
                "alice@gmail.com",
                "+08989787898978",
                LocalDate.of(2000,1,1)
        );
        // if valid we acn store customer in db
        CustomerValidatorService validatorService = new CustomerValidatorService();
        System.out.println(validatorService.isValid(customer));

        //todo              COMBINATOR PATTERN
        // allows you to change functions together
        // is a function that might take all the functions as argument
        // and return new functions
        ValidationResult result = isEmailValid()
                .and(isPhoneNumberValid())
                .and(isAdultValid())
                .apply(customer);
        System.out.println(result);
        if (result != ValidationResult.SUCCESS){
            throw  new IllegalStateException(result.name());
        }





    }
}
