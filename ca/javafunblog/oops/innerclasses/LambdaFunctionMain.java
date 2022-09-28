package ca.javafunblog.oops.innerclasses;

import java.time.LocalDateTime;
import java.time.Month;

public class LambdaFunctionMain {
    public static void main(String[] args) {
        Phone phone = new Phone() {
            @Override
            public void number() {

            }
        };

        // same as
        // 1. check the abstract method
        // 2. is it accepting params?
        // 3. doesn't matter. use `->`
        // 4. what is its return type?
        // syntax -> () -> {};
        Phone phone1 = () -> {
            return;
        };


        // use case 2
        Book book = () -> {
            int pages = 100;
            return pages;
        };

        // same as
        // remove curly braces when you know there is only one line
        // for the method body
        // also remove, the `return` keyword because return should be
        // kept inside the curly braces.
        Book book1 = () -> 100;

        // use case 3
        //
        Watch watch = (showCorrectTime) -> {
            if (showCorrectTime) {
                return LocalDateTime.now();
            }
            return LocalDateTime
                    .of(2020, Month.APRIL,
                            22, 10,
                            10, 10);

        };

        System.out.println(watch.time(true));
        System.out.println(watch.time(false));

        // same as
        // when there is only one parameter for an abstract method
        // you don't need braces - they are just optional
        Watch watch1 = methodParameter -> {
            if (methodParameter) {
                return LocalDateTime.now();
            }
            return LocalDateTime
                    .of(2020, Month.APRIL,
                            22, 10,
                            10, 10);
        };

        // basic lambda syntax
        // () -> {} -: when the method accepts no params and, it returns nothing
        // singleParam -> {} -: when the method accepts single param and, it
        // returns nothing
        // singleParam -> return something; -: but it has only one line, and
        // it returns something
        // singleParam -> {statement1; return something;};



    }
}

