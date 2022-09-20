package ca.javafunblog.oops.interfaces.app;

public class CricketCoach implements Coach{
    @Override
    public void dailyWorkOut() {
        System.out.println("Practice bowling today!!!");
    }

    @Override
    public void dailyMotivation() {
        System.out.println("YOU CAN DO THIS!!! ");
    }
}
