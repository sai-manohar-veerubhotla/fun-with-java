package ca.javafunblog.collections.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class ListUtil {


    public static List<Integer> listNovice(int size, int bound) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(bound));
        }

        return list;
    }

    public static List<Integer> list() {
        return list(10, 100);
    }

    public static List<Integer> list(int size, int bound) {
        Random random = new Random();
        // METHOD CHAINING
        return random.ints(size, 1, bound)
                .boxed()
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
//        randomDemo();
        System.out.println(listNovice(4, 100));
        System.out.println(list(4, 100));
    }

    public static List<Integer> list(int size) {
        return List.of(1, 2, 3, 4, 5, 10, 9, 8, 7, 6);
    }

    private static void randomDemo() {
        Random random = new Random();
        System.out.println(random.nextInt());
        System.out.println(random.nextInt(100));
    }

}
