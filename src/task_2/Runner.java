package task_2;

import java.util.Random;
import java.util.function.Predicate;

public class Runner {
    public static void main(String[] args) {

        Random random = new Random();
        int num = 0 - random.nextInt(2);
        Predicate <Integer> predicate = x -> x >= 0;
        System.out.println("Test predicate interface = " + predicate.test(num));

        //to do 9 wtuk

        ExampleFunctionalInterface<String> firstExampleFunctionalInterface = new ExampleFunctionalInterface<String>() {
            @Override
            public String method(String val) {
                return val + " anon class";
            }
        };

        ExampleFunctionalInterface<String> secondExampleFunctionalInterface = str -> str + " lamda";

        System.out.println(firstExampleFunctionalInterface.method("First example") + "\nFirst example " +
                firstExampleFunctionalInterface.defaultMethod());

        System.out.println(secondExampleFunctionalInterface.method("Second example") + "\nSecond example " +
                secondExampleFunctionalInterface.defaultMethod());

        System.out.println(ExampleFunctionalInterface.staticMethod());

    }
}
