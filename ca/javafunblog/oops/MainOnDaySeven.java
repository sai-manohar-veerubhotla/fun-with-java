package ca.javafunblog.oops;

public class MainOnDaySeven {

    public static void main(String[] args) {
        SuperFunClass superFunClass = new SuperFunClass(10, 20);
        System.out.println(superFunClass); // ca.javafunblog.oops.SuperFunClass@2f7c7260
        // it is invoking toString() from the Object class which is the root
        // of all the classes in Java
        // EVERY CLASS IN JAVA INHERITS FROM `Object` Class
        // ca.javafunblog.oops.SuperFunClass inherits Object
        // ca.javafunblog.oops.SuperFunClass extends Object

    }

}
