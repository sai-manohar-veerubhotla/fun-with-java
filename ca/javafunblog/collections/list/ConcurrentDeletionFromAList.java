package ca.javafunblog.collections.list;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class ConcurrentDeletionFromAList {

    public static void deletion() {
        List<Integer> list = ListUtil.list(4, 110);
        System.out.println(list);
/*
        list.forEach(integer -> {
            if(integer % 2 == 0){
                list.remove(integer);
                System.out.println(list);
            }
        }); // this will throw a concurrent modification exception CME

        System.out.println(list);*/
        // how to overcome it?
        // That is exactly why we have a concept called Iterators

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (next % 2 == 0) {
                iterator.remove();
            }
        }
        System.out.println(list);

        list.clear();
        list = ListUtil.list(4, 110);
        System.out.println(list);
        ListIterator<Integer> listIterator = list.listIterator(list.size());

        while (listIterator.hasPrevious()) {
            if (listIterator.previous() % 2 != 0) {
                listIterator.remove();
            }
        }

        System.out.println(list);

    }


    public static void streamsFun() {
        List<Integer> list = ListUtil.list(4, 110);
        System.out.println(list);
        List<Integer> evens = list.stream()
                .filter(integer -> integer % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(evens);


        list.clear();

        list = ListUtil.list();

        System.out.println(list);

        System.out.println(list.stream().count());

        System.out.println(list.stream()
                .allMatch(integer -> integer % 2 != 0));

        System.out.println(list.stream()
                .anyMatch(integer -> integer % 2 != 0));

        List<Integer> distinct = List.of(1, 1, 1, 1, 1).stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(distinct);

        // make sure your stream is ordered for deterministic results
        List<Integer> dropWhile = list.stream()
                .sorted()
                .dropWhile(integer -> integer % 2 != 0)
                .collect(Collectors.toList());
        System.out.println(dropWhile);

        list.clear();


    }


    public static void optionalDemo() {
        var list = List.<Integer>of(1);

       /* List<Object> objects = List.of(null);
        int i = objects.get(0).hashCode();*/

        Optional<Integer> first = list.stream()
                .findFirst();

        first.ifPresent(i -> System.out.println(i));
        first.ifPresent(System.out::println);


    }
    // STREAMS ARE LAZY
    private static void streams(){
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5)
                .filter(integer -> integer % 5 == 0);

        System.out.println(stream.collect(Collectors.toList()));

    }

    public static void main(String[] args) {
//        deletion();
//        streamsFun();
//        optionalDemo();
        streams();
    }

    private static List<Float> list(int size, int bound) {
        Random random = new Random();
        return random.doubles(size, 0.0, bound)
                .mapToObj(d -> (float) d)
                .collect(Collectors.toList());
    }
}
