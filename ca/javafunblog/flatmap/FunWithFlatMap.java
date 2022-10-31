package ca.javafunblog.flatmap;

import ca.javafunblog.collections.list.ListUtil;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FunWithFlatMap {

    private static void fun() {

        List<Integer> list1 = ListUtil.list();
        List<Integer> list2 = ListUtil.list();
        List<Integer> list3 = ListUtil.list();

        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);

        Stream<List<Integer>> stream = Stream.of(list1, list2, list3);

        // our goal is to merge all the elements in each list into a single list

        Stream<Integer> integerStream = stream.flatMap(new Function<List<Integer>, Stream<Integer>>() {
            @Override
            public Stream<Integer> apply(List<Integer> list) {
                return list.stream();
            }
        });

        List<Integer> integers = integerStream.collect(Collectors.toList());

        // same AS ABOVE BUT COMMENTING IT OUT SO THAT WE THE STREAM WON'T COMPLAIN.
      /*  List<Integer> collect = stream
                .flatMap(Collection::stream)
                .toList();

*/
    }

    public static void main(String[] args) {
        fun();
    }

}
