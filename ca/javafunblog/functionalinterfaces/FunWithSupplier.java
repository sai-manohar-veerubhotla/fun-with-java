package ca.javafunblog.functionalinterfaces;

import ca.javafunblog.collections.list.ListUtil;

import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class FunWithSupplier {
    private static void funWithSupplier() {
        Supplier<Integer> supplier1 = new Supplier<Integer>() {
            @Override
            public Integer get() {
                Random random = new Random();
                return random.nextInt(100);
            }
        };

        // same as
        Supplier<Integer> supplier2 = () -> {
            Random random = new Random();
            return random.nextInt(100);
        };

        Integer integer = supplier2.get();
        System.out.println(integer);

        Supplier<List<Integer>> listSupplier = () -> ListUtil.list();

        // same as
        Supplier<List<Integer>> listSupplier2 = ListUtil::list;

        //
        Supplier<List<Integer>> listSupplier3 = () -> ListUtil.list(10, 1000);


    }

    public static void main(String[] args) {
        funWithSupplier();
    }

}
