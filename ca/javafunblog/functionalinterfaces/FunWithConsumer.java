package ca.javafunblog.functionalinterfaces;

import java.util.function.Consumer;

public class FunWithConsumer {

    private static void consumerDemo(){
        Consumer<String> stringConsumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };

        // same as
        Consumer<String> stringConsumer1 = s -> System.out.println(s);

        // same as
        Consumer<String> stringConsumer2 = System.out::println;

        stringConsumer2.accept("Vamsi");


    }

    public static void main(String[] args) {
        consumerDemo();
    }
}
