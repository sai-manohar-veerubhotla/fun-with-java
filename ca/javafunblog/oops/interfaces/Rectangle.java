package ca.javafunblog.oops.interfaces;

// concrete class
public class Rectangle implements Shape{

    public void recMethod(){
        System.out.println("Rectangle method");
    }

    @Override
    public void someMethod() {
        System.out.println("Rectangle method");
    }

    @Override
    public void properties() {
        System.out.println("I am the properties inside rectangle");
    }
}
