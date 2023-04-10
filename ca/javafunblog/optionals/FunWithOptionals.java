package ca.javafunblog.optionals;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;

public class FunWithOptionals {


    public static void main(String[] args) {
        Sample sample = new Sample(1,
                Optional.of("Manohar"));
        // you KNOW that for using the object where ever you want
        // it is just enough to pass the int value
//        System.out.println(sample.getaString().toLowerCase());

        Optional<String> optional = sample.getaString();

        // 1
        if (optional.isPresent()) {
            String s = optional.get();
            System.out.println(s.toLowerCase());
        }


        // 2
        Optional<String> s2 = sample.getaString()
                .map(new Function<String, String>() {
                    @Override
                    public String apply(String s) {
                        return s.toLowerCase();
                    }
                });

        Optional<String> s3 = sample.getaString()
                .map(s -> s.toLowerCase());

        Optional<String> s4 = sample.getaString()
                .map(String::toLowerCase);

        // 3


        if (optional.isPresent()) {
            String s = optional.get();
            System.out.println(s.toLowerCase());
        } else {
            throw new RuntimeException("Value not present");
        }

        sample.getaString()
                .map(String::toLowerCase)
                .ifPresentOrElse(
                        new Consumer<String>() {
                            @Override
                            public void accept(String s) {
                                System.out.println(s);
                            }
                        },
                        new Runnable() {
                            @Override
                            public void run() {
                                throw new RuntimeException("Not present");
                            }
                        }

                );


        sample.getaString()
                .map(String::toLowerCase)
                .ifPresentOrElse(
                        s -> System.out.println(s),
                        () -> {
                            throw new RuntimeException("Not present");
                        }

                );

        sample.getaString()
                .map(String::toLowerCase)
                .ifPresentOrElse(
                        System.out::println,
                        () -> {
                            throw new RuntimeException("Not present");
                        }

                );


        // 4

        String vamsi = sample.getaString()
                .map(String::toLowerCase)
                .orElse("Vamsi");



        Optional<Integer> op1 = Optional.empty();

       // System.out.println(op1.get()); // NoSuchElementException

        Optional<Integer> op2 = Optional.empty();


        Integer integer = op2.orElseThrow();






    }

}
