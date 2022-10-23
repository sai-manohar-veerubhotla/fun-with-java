package ca.javafunblog.collections.set;

import ca.javafunblog.collections.list.ListUtil;


import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;


public class FunWithSet {

    private static void setDemo() {
        // Set
        // 1. HashSet
        // constant time O(1)
        // WILL NOT PRESERVE INSERTION ORDER
        // HashSet in java was built on HashMap
        // 2. TreeSet
        // WILL MAINTAIN NATURAL SORTING ORDER UNLESS SPECIFIED OTHERWISE
        // TreeSet in java was built on TreeMap
        // 3. LinkedHashSet
        // WILL PRESERVE THE INSERTION ORDER
        // LinkedList + HashSet
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> treeSet = new TreeSet<>();
        Set<Integer> linkedHashSet = new LinkedHashSet<>();


    }

    private static void hashSetFun() {
        List<Integer> list = ListUtil.list();
        System.out.println(list);
        Set<Integer> hashSet = new HashSet<>(list);
        System.out.println(hashSet);
        // O(1)
        hashSet.contains(5);
        for (Integer e : hashSet) {
            System.out.println(e);
        }
        // same as
        hashSet.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });

        // same as
//        hashSet.forEach(integer -> System.out.println(integer));
        // same as
        // method references
        // :: method reference operator in java
        // don't get confused with :: in scope resolution operator in cpp
//        hashSet.forEach(System.out::println);

        hashSet.clear();

        hashSet = new HashSet<>(list);
        Object[] objects = hashSet.toArray();
        //System.out.println(Arrays.toString(objects));
       /* Arrays.stream(objects)
                .forEach(object -> {
                    if(object instanceof Integer){
                        System.out.print(object + ", ");
                    }
                });
*/

        // wrapper class -> Object array

        Integer[] integers = new Integer[hashSet.size()];
        hashSet.toArray(integers);
        System.out.println(Arrays.toString(integers));


        int[] ints = new int[hashSet.size()];
        int index = 0;
   /*     for (Integer i: integers) {
            ints[index++] = i;
        }*/
        AtomicInteger atomicInteger = new AtomicInteger(0);
        Arrays.stream(integers)
                .forEach(integer -> ints[atomicInteger.getAndIncrement()] = integer);

        int[] ints1 = Arrays.stream(integers)
                .mapToInt(integer -> integer)
                .toArray();

    }


    private static void treeSetFun() {
        Set<Integer> set = new TreeSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>(ListUtil.list(10));
        System.out.println(treeSet);
        System.out.println(treeSet.ceiling(10)); // 10
        System.out.println(treeSet.ceiling(11)); // null
        System.out.println(treeSet.floor(11)); // 10
        System.out.println(treeSet.floor(10)); // 10
        NavigableSet<Integer> navigableSet = treeSet.descendingSet();
        System.out.println(navigableSet);
        System.out.println(treeSet.first());
        System.out.println(treeSet.last());
        SortedSet<Integer> headSetExcl = treeSet.headSet(5);
        System.out.println(headSetExcl);
        SortedSet<Integer> headSetIncl = treeSet.headSet(5, true);
        System.out.println(headSetIncl);
        // this is same as ceiling but ceiling is originally from TreeSet
        // whereas higher is from NavigableSet
        System.out.println(treeSet.higher(11)); // null
        System.out.println(treeSet.lower(11)); // 10
        System.out.println(treeSet.lower(0)); // null
        System.out.println(treeSet.pollFirst()); // 1
        System.out.println(treeSet.pollLast()); // 10
        System.out.println(treeSet.subSet(4, 8)); // [4,5,6,7]
        // [4,5,6,7,8]
        System.out.println(treeSet.subSet(4, true, 8, true));
    }

    private static void linkedHashSetFun(){
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(ListUtil.list(10));
        System.out.println(linkedHashSet);
        // same methods as HashSet
    }

    private static void moreFun(){
        Set<Integer> set = Set.of(1, 2, 3);
    }


    private static void spliteratorFun() {
        // WILL GET BACK TO THIS IN THE NEXT CLASSES
    }


    public static void main(String[] args) {
//        hashSetFun();
//        treeSetFun();
//        spliteratorFun();
        linkedHashSetFun();
    }
}
