package ca.javafunblog.oops.innerclasses;

public class AnonymousInnerClassMain {
    public static void main(String[] args) {


        Duke duke = new Duke() {
            // this is called anonymous inner class
            @Override
            public void info() {

            }

            @Override
            public void prop() {

            }
        };

        Duke duke1 = new Duke() {
            @Override
            public void info() {

            }

            @Override
            public void prop() {

            }
        };
    }
}
