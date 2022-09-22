package ca.javafunblog.oops.interfaces.class3;

public interface SampleThree {


    void sampleOne();

    // java8

    // new access modifier

    default void sampleTwo(){
        sampleThree();
        System.out.println("SampleTwo");
    }


    default MethodReturnType sampleFive(){
        System.out.println("sampleFive");
        return new MethodReturnType();
    }

    static void sampleFour(){
        System.out.println("SampleFour");
    }


    // java9 private methods

    private void sampleThree(){
        System.out.println("SampleThree");
    }



}
