package ca.javafunblog.oops.interfaces;

public class App {
    private Rectangle rectangle; // null
    private Square square; // null

    public App(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    public App(Square square){
        this.square = square;
    }

    private Shape shape;

    public App(Shape shape){
        this.shape = shape;
    }

    public void someMethod(){
        shape.someMethod();
    }



    public App(Rectangle rectangle, Square square) {
        this.rectangle = rectangle;
        this.square = square;
    }

    public void recMethod(){
        rectangle.recMethod();
    }

    public void squareMethod(){
        // null.squareMethod();
        // NPE
        square.squareMethod();
    }
}
