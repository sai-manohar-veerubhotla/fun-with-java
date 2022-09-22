package ca.javafunblog.oops.interfaces.class3;

public class Main2 {
    public static void main(String[] args) {
        SampleFour sampleFour = new SampleFiveImpl();
        sampleFour.add();
        SampleFour sampleFour1 =  () -> {
            System.out.println();
        };
         // lambda functions are nothing but inner classes
        SampleFour sampleFour2 = new SampleFour() {
            @Override
            public void add() {

            }
        };
        SampleFive sampleFive = new SampleFive() {
            @Override
            public void add2() {

            }

            @Override
            public void add3() {

            }
        };
        sampleFour1.add();
    }
}
