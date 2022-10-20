package ca.javafunblog.functionalinterfaces;

import java.util.function.Predicate;

public class FunWithPredicate {

    private static void predicateFun(){
        // test
        Predicate<Integer> predicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer > 100;
            }
        };

        // same as
        Predicate<Integer> predicate2 = integer -> integer > 100;

        Predicate<Integer> predicate1 = integer -> integer < 100;

        boolean test = predicate2.test(99);

        System.out.println(test);
        Predicate<Integer> negate = predicate2.negate();

        System.out.println(negate.test(99));
        // true || false ->
        // logical OR -> short-hand logical OR
        // true || true -> true
        // true || false -> true
        // false || false -> false
        // true || true -> true

        Predicate<Integer> or = predicate1.or(predicate2);
        System.out.println(or.test(95));

        //short-hand logical AND
        // true && true -> true
        // false && true -> false

        Predicate<Integer> predicate3 = integer -> integer > 200;

        Predicate<Integer> andPredicate = predicate2.and(predicate3);

        System.out.println(andPredicate.test(98));

    }

    public static void main(String[] args) {
        predicateFun();
    }
}
