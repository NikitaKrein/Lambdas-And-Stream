package task_3;

public class Runner {
    public static void main(String[] args) {
        ThreeFunction<Integer, Integer, Integer, Integer> sum = (x, y, z)->(x + y + z);
        ThreeFunction<Integer, Integer, Integer, Integer> multi = (x, y, z)->(x * y * z);
        System.out.println("sum of 1, 2, 3 = " + sum.apply(1,2,3));
        System.out.println("multiplication(umnozhenie) of 4, 2, 3 = " + multi.apply(4,2,3));
    }
}
