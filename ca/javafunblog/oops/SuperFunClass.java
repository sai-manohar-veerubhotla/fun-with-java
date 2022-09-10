package ca.javafunblog.oops;

public class SuperFunClass {

    int a;
    int b;

    public SuperFunClass(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public SuperFunClass() {
    }

    // 1. Inheritance
    // it is done with `extends` keyword

    @Override
    public String toString() {
        return "ca.javafunblog.oops.SuperFunClass{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
