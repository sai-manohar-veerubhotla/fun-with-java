package ca.javafunblog.oops.interfaces.app;

public class AppImproved {

    private Coach coach;


    public AppImproved(Coach coach){
        this.coach = coach;
    }

    public void getDailyWorkOut(){
        coach.dailyWorkOut();
    }

    public void getDailyMotivation(){
        coach.dailyMotivation();
    }




}
