package ca.javafunblog.oops.app;

public class RectangleMain {

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(10, 20, 30);
        System.out.println(rectangle1.area());
        System.out.println(rectangle1.volume());
        System.out.println(rectangle1);
        System.out.println(rectangle1.description());
    }

}
