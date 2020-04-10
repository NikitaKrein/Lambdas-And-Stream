package task_1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static java.util.Comparator.comparing;

public class Runner {
    public static void main(String[] args) throws IOException {

        List<Person> persons = Arrays.asList(
                new Person("Dingo", 7),
                new Person("Nik", 19),
                new Person("Kate", 11),
                new Person("Steve", 15),
                new Person("Rafa", 8)
        );

        System.out.println("Sorted by name");
        persons
                .stream()
                .sorted(comparing(Person::getName))
                .forEach(System.out::println);

        System.out.println();

        System.out.println("Sorted by age:");

        persons
                .stream()
                .sorted(comparing(Person::getAge))
                .forEach(System.out::println);
    }
}
