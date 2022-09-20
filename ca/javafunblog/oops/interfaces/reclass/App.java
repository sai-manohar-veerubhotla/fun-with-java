package ca.javafunblog.oops.interfaces.reclass;

public class App {

    private int a;
    private ReInterfaceImpl1 reInterfaceImpl1 = new ReInterfaceImpl1();

    public App(int a, ReInterfaceImpl1 reInterfaceImpl1) {
        this.a = a;
        this.reInterfaceImpl1 = reInterfaceImpl1;
    }


    public int a(){
        return a;
    }

    public void someMethod(){
        reInterfaceImpl1.someMethod();
    }


}
