package task_5;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FootballPlayerCollector implements Collector<FootballPlayer, List<Integer>, Integer> {
    @Override
    public Supplier<List<Integer>> supplier() {
        return ArrayList::new;
    }

    @Override
    public BiConsumer<List<Integer>, FootballPlayer> accumulator() {
        return (list, obj) -> list.add(obj.getSkill());
    }

    @Override
    public BinaryOperator<List<Integer>> combiner() {
        return (fir, sec) -> Stream.of(fir, sec)
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }

    @Override
    public Function<List<Integer>, Integer> finisher() {
        return col -> (int) col.stream()
                .filter(el -> el > 87)
                .count();
    }

    @Override
    public Set<Characteristics> characteristics() {
        return EnumSet.of(Characteristics.UNORDERED);
    }
}
