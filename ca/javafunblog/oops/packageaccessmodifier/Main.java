package ca.javafunblog.oops.packageaccessmodifier;

import ca.javafunblog.oops.accessmodifiers.SuperClass;

public class Main extends SuperClass {

    @Override
    protected void protectedMethod(){
        System.out.println("I am an overridden protected method in Main");
    }
    public static void main(String[] args) {
        SuperClass superClass = new SuperClass();
        superClass.publicMethod();

       Main main = new Main();
       main.protectedMethod();

//        superClass.protectedMethod();


        //



    }
}
