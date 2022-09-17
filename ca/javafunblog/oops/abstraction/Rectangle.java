package ca.javafunblog.oops.abstraction;

public class Rectangle extends AbstractClass {

    public Rectangle(){
        System.out.println("I am inside Rectangle constructor");
    }

    @Override
    public void info2() {
        System.out.println("I am a rectangle");
    }
}
