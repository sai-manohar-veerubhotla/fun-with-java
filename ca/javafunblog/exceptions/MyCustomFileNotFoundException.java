package ca.javafunblog.exceptions;

public class MyCustomFileNotFoundException extends RuntimeException{

    public MyCustomFileNotFoundException(){

    }

    public MyCustomFileNotFoundException(String message){
        super(message);
    }
}
