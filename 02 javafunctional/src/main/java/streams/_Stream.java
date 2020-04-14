package streams;

import javax.crypto.spec.PSource;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class _Stream {
    public static void main(String[] args) {
        List<Person>people = List.of(
                new Person("Jonh",Gender.MALE),
                new Person("Maria",Gender.FEMALE),
                new Person("Aisha",Gender.FEMALE),
                new Person("Alex",Gender.MALE),
                new Person("Alice",Gender.FEMALE)
        );

        // we map we transform the list into a gender
        // we now have a list full of gender
        //we collect to a set to remove the duplicate
        //and then we print
        people.stream()
                .map(person -> person.gender)
                .collect(Collectors.toSet())
                .forEach(System.out::println);
        //we can know the lenght of each name

        Function<Person, String> personStringFunction = person -> person.name;
        ToIntFunction<String> length = s -> s.length();
        IntConsumer println = x -> System.out.println(x);

        people.stream()
                .map(personStringFunction)
                .mapToInt(length)
                .forEach(println);
        //.mapToInt(name -> name.length()) == .mapToInt(String::length)



    }

    static class Person{
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }
    }

    enum Gender {
        MALE,FEMALE
    }
}
