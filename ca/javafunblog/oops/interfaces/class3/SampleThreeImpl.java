package ca.javafunblog.oops.interfaces.class3;

public class SampleThreeImpl implements SampleThree{
    @Override
    public void sampleOne() {
        System.out.println("I am overridden!!");
    }

    @Override
    public void sampleTwo() {
        System.out.println("I am a default method which was overridden");
    }
}
