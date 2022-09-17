package ca.javafunblog.oops.abstraction;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.info();

        // THIS CONCEPT IS CALLED ANONYMOUS CLASSES IN JAVA
        // LAMBDA EXPRESSIONS
       /* AbstractClass abstractClass = new AbstractClass() {
            @Override
            public void info2() {

            }
        };*/


        // 'AbstractClass' is abstract; cannot be instantiated
//        AbstractClass abstractClass = new AbstractClass();
//        abstractClass.info();
    }
}
