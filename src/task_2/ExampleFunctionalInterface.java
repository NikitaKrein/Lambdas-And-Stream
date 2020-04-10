package task_2;

@FunctionalInterface
public interface ExampleFunctionalInterface<T>{

    T method (T val);

    default String defaultMethod(){
        return "default method!";
    }

    static String staticMethod(){
        return "Static method!";
    }
}
