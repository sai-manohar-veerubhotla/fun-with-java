package ca.javafunblog.oops.accessmodifiers;

public class NoKeywordAccessModifierMain {


    public static void main(String[] args) {
        SuperClass superClass = new SuperClass();
        superClass.noKeywordMethod();

        // Inside the package, same as public.
        // outside the package, cannot be accessed no matter what.
        // So, this can also called as a package-private modifier.


        SubClass subClass = new SubClass();
        subClass.noKeywordMethod();
    }

}
