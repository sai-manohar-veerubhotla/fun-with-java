package ca.javafunblog.oops.interfaces.app;

public class App {

    private GymCoach gymCoach = new GymCoach();
    private CricketCoach cricketCoach = new CricketCoach();


    public void getDailyGymWorkOut(){
        gymCoach.dailyWorkOut();
    }

    public void getDailyGymMotivation(){
        gymCoach.dailyMotivation();
    }


    public void getDailyCricketWorkOut(){
        cricketCoach.dailyWorkOut();
    }

    public void getDailyCricketMotivation(){
        cricketCoach.dailyMotivation();
    }

    public static void main(String[] args) {
        App app = new App();
        app.getDailyGymWorkOut();
        app.getDailyGymMotivation();


    }
}
