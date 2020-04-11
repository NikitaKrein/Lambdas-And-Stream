package task_2;

import java.net.BindException;
import java.util.Random;
import java.util.function.*;

public class Runner {
    public static void main(String[] args) {

        Random random = new Random();
        int num1 = 0 - random.nextInt(2);
        int num2 = 0 - random.nextInt(2);

        Predicate <Integer> predicate = x -> x >= 0;
        System.out.println("Test predicate interface = " + predicate.test(num1));

        BiPredicate <Integer, Integer> biPredicate = Integer::equals;
        System.out.println("Test BiPredicate interface = " + biPredicate.test(num1, num2));

        Supplier<String> supplier = () -> "Test supplier interface!";
        System.out.println(supplier.get());

        String consumerstr = "Test consumer interface!";
        Consumer<String> consumer = System.out::println;
        consumer.accept(consumerstr);

        String biConsumerstr = "BiConsumer";
        BiConsumer<String, String> biConsumer = (s1, s2) -> {
            System.out.println
                    (s1.replaceAll("consumer", s2));
        };
        biConsumer.accept(consumerstr, biConsumerstr);

        Function <Integer, String> function = (x) -> ("Test function interface! num1 = " + x);
        System.out.println(function.apply(num1));

        BiFunction <Integer, Integer, String> biFunction = (x, y) ->
                ("Test function interface! num1 = " + x + " | num2 = " + y);
        System.out.println(biFunction.apply(num1, num2));

        String unaryOperatorStr = "Test UnaryOperator interface!";
        UnaryOperator<String> unaryOperator = (s) -> s;
        System.out.println(unaryOperator.apply(unaryOperatorStr));

        String binaryOperatorStr = "Binary";
        BinaryOperator<String> binaryOperator = (s1, s2) ->
                s1.replaceAll("Unary", s2);
        System.out.println(binaryOperator.apply(unaryOperatorStr, binaryOperatorStr));

        Runnable runnable = () -> System.out.println("Test runnable interface!");
        runnable.run();

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
