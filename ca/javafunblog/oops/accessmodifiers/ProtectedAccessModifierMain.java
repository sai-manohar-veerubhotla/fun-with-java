package ca.javafunblog.oops.accessmodifiers;

public class ProtectedAccessModifierMain {

    public static void main(String[] args) {
        SuperClass superClass = new SuperClass();
        superClass.protectedMethod();

        // Inside the package -> Same as public access modifier
        // outside the package -> Only in the derived classes
        // what does that mean?
        // it means, the classes outside-of the package which are
        // inheriting the super class.


    }

}
