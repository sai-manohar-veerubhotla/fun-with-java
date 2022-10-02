package ca.javafunblog.collections;

import java.util.ArrayList;
import java.util.List;

public class ListFun {

    private static void listDemo() {
        // I want to store int elements in a list
        // <> -> diamond operator in java
        // a collection cannot store primitives.
        // it wraps them inside a wrapper class
        // int -> Integer
        // short -> Short
        // char -> Character
        // list is a linear data structure.
        // can have duplicates.
        // list scales up dynamically.
     /*   List<Short> shorts = new ArrayList<>();
        List<Character> characters = new ArrayList<>();
        List<Float> floats = new ArrayList<>();
        List<Boolean> booleans = new ArrayList<>();
        List<Long> longs = new ArrayList<>();
        List<Double> doubles = new ArrayList<>();*/
        List<Integer> integers = new ArrayList<>();
        int a = 1;
        integers.add(a); // this is called auto-boxing.
        // a phenomenon where a primitive is converted into its wrapper class.
        Integer integer = Integer.valueOf(1);
        integers.add(integer);
        System.out.println(integers);
        integers.clear();

    }

    private static void add() {
        List<Integer> integers = new ArrayList<>();
        int a = 1;
        integers.add(a); // this is called auto-boxing.
        // a phenomenon where a primitive is converted into its wrapper class.
        Integer integer = Integer.valueOf(1);
        integers.add(integer);
        System.out.println(integers); // [1,1]

        System.out.println(integers.get(0));
        System.out.println(integers.get(1));
        integers.add(0, 111);
        System.out.println(integers); // // [111,1,1]

        integers.clear();


    }

    public static void size() {
        List<Integer> integers = new ArrayList<>();
        integers.add(111);
        integers.add(22);
        integers.add(11);

        System.out.println(integers.size());
        integers.clear();
    }

    private static void clear() {
        List<Integer> integers = new ArrayList<>();
        integers.add(111);
        integers.add(22);
        integers.add(11);
        System.out.println(integers);
        integers.clear();
        System.out.println(integers);

    }

    private static void contains() {
        List<Integer> integers = new ArrayList<>();
        integers.add(111);
        integers.add(22);
        integers.add(11);
        System.out.println(integers);
        System.out.println(integers.contains(111)); // true
        System.out.println(integers.contains(0)); // false

        //of is static method added in java9
        List<Integer> newList = List.of(22, 11);
        System.out.println(newList);
        System.out.println(integers.containsAll(newList)); // true

        List<Integer> newList2 = List.of(11, 22, 1);
        System.out.println(newList2);
        System.out.println(integers.containsAll(newList2)); // false

        integers.clear();

    }

    private static void addAll() {
        List<Integer> integers = new ArrayList<>();
        integers.add(111);
        integers.add(22);
        integers.add(11);
        System.out.println(integers);

        List<Integer> list = List.of(1, 2, 3, 4, 5);
        integers.addAll(list);
        System.out.println(integers);

        integers.clear();
    }

    private static void indexOf() {
        List<Integer> integers = List.of(1, 1, 3, 4, 1);
        System.out.println(integers.indexOf(1)); // 0
        System.out.println(integers.indexOf(5)); // -1

        System.out.println(integers.lastIndexOf(1));
    }

    private static void remove() {
//        List<Integer> integers = List.of(1, 2, 3, 4, 5); -> this
//        creates an Immutable list
        List<Integer> integers = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        /*List<Integer> integers = new ArrayList<>();
        for (int i = 1; i < 6; i++) {
            integers.add(i);
        }*/
        System.out.println(integers);
        boolean remove = integers.remove(Integer.valueOf(3));
        System.out.println(remove);
        System.out.println(integers); // 1,2,4,5

        Integer elementAtIndex3 = integers.remove(3);
        System.out.println(elementAtIndex3); // 3
        System.out.println(integers); // 1,2,4
        integers.removeAll(List.of(1, 2));
        System.out.println(integers); // 4

    }

    private static void set() {
        List<Integer> integers = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        System.out.println(integers);
        // Replaces the element at the specified position in this list
        // with the specified element (optional operation).
        System.out.println(integers.set(1, 400)); // 2
        System.out.println(integers);
        integers.clear();

    }

    private static void moreFun() {
        List<Integer> integers = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        System.out.println(integers);
        boolean b = integers.retainAll(List.of(1, 2));
        integers.retainAll(List.of(1111, 222)); // intersection
        System.out.println(integers);

        integers.addAll(List.of(1, 2, 3, 4, 5));
        List<Integer> integers1 = integers.subList(0, 2);
        System.out.println(integers1);

    }


    public static void main(String[] args) {
//        listDemo();
//        add();
//        size();
//        clear();
//        contains();
//        addAll();
//        indexOf();
//        remove();
//        set();
//        moreFun();
    }
}
