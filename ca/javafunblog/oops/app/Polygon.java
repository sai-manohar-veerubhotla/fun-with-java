package ca.javafunblog.oops.app;

public class Polygon {


    public Polygon(){
        System.out.println("class: " + getClass().getName());
    }

    public Polygon(boolean flag){
        System.out.println("class: " + getClass().getName() + ": " + flag);
    }

    public String description() {
        return "This is a polygon";
    }

}
