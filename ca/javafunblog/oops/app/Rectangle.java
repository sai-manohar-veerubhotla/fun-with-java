package ca.javafunblog.oops.app;

public class Rectangle extends Polygon {

    private double length;
    private double breadth;
    private double height;

    public Rectangle(){
       super(); // a call is being made to the super class no arg constructor
        System.out.println(getClass().getName());
    }

    public Rectangle(double length, double breadth, double height) {
//        super();
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    public double area() {
        return this.length * this.breadth;
    }



    public double volume() {
        return this.length * this.breadth * this.height;
    }


    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", breadth=" + breadth +
                ", height=" + height +
                '}';
    }
}
