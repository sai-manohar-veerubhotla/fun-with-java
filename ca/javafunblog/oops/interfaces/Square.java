package ca.javafunblog.oops.interfaces;


public class Square implements Shape{

    public void squareMethod(){
        System.out.println("square method!!");
    }

    @Override
    public void someMethod() {
        System.out.println("square method!!");
    }

    @Override
    public void properties() {
        System.out.println("I am a square!");
    }
}
