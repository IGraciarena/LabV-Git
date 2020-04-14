package FunctionalInterface;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        // imperative mode
        System.out.println(isPhoneNumberValid("0700000000"));
        System.out.println(isPhoneNumberValid("090009877300"));
        // functional mode
        System.out.println(isPhoneNumberValidPredicate.test("070000000000"));
        // functional mode BI
        System.out.println(
                isPhoneNumberValidPredicate.and(containsNumber3).test("07009877300")
        );
    }
    // imperative mode
    static boolean isPhoneNumberValid(String phoneNumber){
        return phoneNumber.startsWith("07")&& phoneNumber.length()==11;
    }
    // functional mode
    static Predicate<String>isPhoneNumberValidPredicate = phoneNumber ->
            phoneNumber.startsWith("07")&& phoneNumber.length()==11;
    // functional mode
    static Predicate<String>containsNumber3 = phoneNumber ->
            phoneNumber.contains("3");

}
