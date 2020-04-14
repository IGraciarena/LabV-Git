package combinatorPattern;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

import static combinatorPattern.CustomerRegistrationValidator.*;
import static combinatorPattern.CustomerRegistrationValidator.ValidationResult.*;

public interface CustomerRegistrationValidator extends
        Function <Customer, ValidationResult> {

    static CustomerRegistrationValidator isEmailValid(){
        return customer -> customer.getEmail().contains("@") ?
              SUCCESS : EMAIL_NOT_VALID;
    }
    static CustomerRegistrationValidator isPhoneNumberValid(){
        return customer -> customer.getPhoneNumber().startsWith("+0") ?
                SUCCESS : PHONE_NUMBER_NOT_VALID;
    }
    static CustomerRegistrationValidator isAdultValid(){
        return customer -> Period.between(customer.getDob(), LocalDate.now()).getYears()>16 ?
                SUCCESS : IS_NOT_AN_ADULT;
    }

    // COMBINATOR
    default CustomerRegistrationValidator and (CustomerRegistrationValidator other){
        //im gonna return a customer and we are gonna to apply
        //a result for this
        return customer -> {
            ValidationResult result = this.apply(customer);
            return result.equals(SUCCESS) ? other.apply(customer) : result;
        };
    }

    enum ValidationResult {
        EMAIL_NOT_VALID,
        IS_NOT_AN_ADULT,
        PHONE_NUMBER_NOT_VALID,
        SUCCESS
    }
}
