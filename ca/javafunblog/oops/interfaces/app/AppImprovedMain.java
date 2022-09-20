package ca.javafunblog.oops.interfaces.app;

public class AppImprovedMain {
    public static void main(String[] args) {
        GymCoach gymCoach = new GymCoach();
        AppImproved app = new AppImproved(gymCoach);
        app.getDailyWorkOut();
        app.getDailyMotivation();


        CricketCoach cricketCoach = new CricketCoach();
        AppImproved app2 = new AppImproved(cricketCoach);
        app.getDailyWorkOut();
        app.getDailyMotivation();
    }
}
