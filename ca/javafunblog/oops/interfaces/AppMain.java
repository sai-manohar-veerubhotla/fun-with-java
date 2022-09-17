package ca.javafunblog.oops.interfaces;

public class AppMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        App app = new App(rectangle);

        Square square = new Square();
        App app1 = new App(square);


        App app3 = new App(rectangle, square);
        app3.squareMethod();
        app3.recMethod();

        Shape shape = new Rectangle();
        Shape shape2 = new Square();

        App app4 = new App(shape2);
        app4.someMethod();

    }
}
