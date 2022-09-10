package ca.javafunblog.oops.app;

public class Rectangle extends Polygon {

    private double length;
    private double breadth;
    private double height;


    public Rectangle(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    public double area() {
        return this.length * this.breadth;
    }

    @Override
    public String description() {
      return "This is 4 sided polygon";
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
