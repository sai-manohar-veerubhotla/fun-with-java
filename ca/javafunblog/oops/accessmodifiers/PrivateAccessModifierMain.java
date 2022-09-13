package ca.javafunblog.oops.accessmodifiers;

public class PrivateAccessModifierMain {
    public static void main(String[] args) {
        SuperClass superClass = new SuperClass();
//        System.out.println(superClass.someInt);
// someInt has private access in ca.javafunblog.oops.accessmodifiers.SuperClass
//        System.out.println(superClass.someMethod());
        // 'someMethod()' has private access in 'ca.javafunblog.oops.accessmodifiers.SuperClass'
//        SuperClass.someInt2; // 'someInt2' has private access in 'ca.javafunblog.oops.accessmodifiers.SuperClass'


        superClass.setSomeInt(100_000);
        System.out.println(superClass.getSomeInt());


        SubClass subClass = new SubClass();
        subClass.setSomeInt(100);
        System.out.println(subClass.getSomeInt());








    }
}
