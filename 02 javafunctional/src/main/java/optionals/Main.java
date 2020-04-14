package optionals;

import java.util.Optional;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Object value = Optional.ofNullable(null)
                .orElseGet(() -> "default value");
        System.out.println(value);

        Supplier<Object> exception = () -> new IllegalStateException("exception");

        Object valueException = Optional.ofNullable(null)
                .orElseGet(exception);
        System.out.println(valueException);

        Optional.ofNullable("john@gmail.com")
                .ifPresent(email -> System.out.println("sending email to"+email)) ;

        Optional.ofNullable(null)
                .ifPresentOrElse(email -> System.out.println("sending email to"+email),
                        ()->{
                            System.out.println("cannot send email");
                        });
    }
}
