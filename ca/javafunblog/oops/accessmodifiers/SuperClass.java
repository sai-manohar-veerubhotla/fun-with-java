package ca.javafunblog.oops.accessmodifiers;

public class SuperClass {

    // 1. if a variable/method is declared private, it cannot be accessed
    // outside-of the class
    private int someInt; // prevent instance variables to be set from
    // anywhere outside-of the class -> this is called encapsulation -> data
    // hiding

    // 2. if a variable/method is declared public, it can be accessed
    // anywhere outside-of the class
    public int publicSomeInt;

    public static int publicStaticSomeInt;

    private void someMethod(){
        System.out.println("Some Method!");
    }

    private static int someInt2;

    // accessor method - getter
    public int getSomeInt(){
        return someInt;
    }

    // accessor method - setter
    public void setSomeInt(int a){
        System.out.println("I am inside setSomeInt: " + a);
        someInt = a;
    }


}
