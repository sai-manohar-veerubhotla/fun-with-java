package ca.javafunblog.oops.interfaces.reclass;

public class Main {
    public static void main(String[] args) {
        ReInterfaceImpl1 reInterfaceImpl1 = new ReInterfaceImpl1();

        App app = new App(10, reInterfaceImpl1);

        app.someMethod();
    }
}
