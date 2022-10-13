package ca.javafunblog.functionalinterfaces;

import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunWithFunction {

    int a = 10;
    // Function#apply
    Function<Float, Integer> floatIntegerFunction = f -> f.intValue();
    Function<Float, Integer> floatIntegerFunction2 = Float::intValue;

    private static void fun2() {
        Function<Float, Integer> f1 = f -> f.intValue();
        Function<Float, Integer> f2 = Float::intValue;
        Function<Integer, Integer> f3 = Function.identity();
        Function<Float, Integer> f4 = f1.andThen(f3);
        System.out.println(f4.apply(5.5f));
    }




    private static void fun() {
        Function<Integer, List<Integer>> listFunction =
                size -> {
                    Random random = new Random();
                    // METHOD CHAINING
                    return random.ints(size, 1, 100)
                            .boxed()
                            .collect(Collectors.toList());
                };

        System.out.println(listFunction.apply(4));
    }


    public static void main(String[] args) {
//        fun();
        fun2();
    }

}
