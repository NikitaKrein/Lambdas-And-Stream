package task_3;

@FunctionalInterface
public interface ThreeFunction <T, K, U, R> {
    R apply(T t, K k , U u);
}
