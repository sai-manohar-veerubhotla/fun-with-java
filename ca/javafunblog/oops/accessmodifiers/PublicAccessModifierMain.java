package ca.javafunblog.oops.accessmodifiers;

public class PublicAccessModifierMain {

    public static void main(String[] args) {
        SuperClass superClass = new SuperClass();
        System.out.println(superClass.publicSomeInt);
        superClass.publicSomeInt = 999;
        System.out.println(superClass.publicSomeInt);
        System.out.println(superClass.publicStaticSomeInt);


        SubClass subClass = new SubClass();
        System.out.println(subClass.publicSomeInt);
        subClass.publicSomeInt = 555;
        System.out.println(subClass.publicSomeInt);
        System.out.println(subClass.publicStaticSomeInt);
    }
}
