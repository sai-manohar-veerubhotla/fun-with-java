package ca.javafunblog.collections.set;

import ca.javafunblog.collections.list.ListUtil;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Consumer;

public class FunWithSet {

    private static void setDemo(){
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


    private static void hashSetFun(){
        List<Integer> list = ListUtil.list();
        System.out.println(list);
        Set<Integer> hashSet = new HashSet<>(list);
        System.out.println(hashSet);
        // O(1)
        hashSet.contains(5);
        for (Integer e: hashSet) {
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
        hashSet.forEach(integer -> System.out.println(integer));
        // same as
        // method references
        // :: method reference operator in java
        // don't get confused with :: in scope resolution operator in cpp
        hashSet.forEach(System.out::println);
    }

    public static void main(String[] args) {
        hashSetFun();
    }
}
