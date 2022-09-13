package ca.javafunblog.oops.app.example;

public class ClassA extends SuperClassOne{
    public ClassA() {
        super(false);
        System.out.println("I am inside ClassA: " + getClass().getName());
    }
}
