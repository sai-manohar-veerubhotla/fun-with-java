package ca.javafunblog.oops.interfaces.app;

public class GymCoach implements Coach{
    @Override
    public void dailyWorkOut() {
        System.out.println("Hit the gym regular!!!");
    }

    @Override
    public void dailyMotivation() {
        System.out.println("You have to hit the gym EVERYDAY!!!");
    }
}
