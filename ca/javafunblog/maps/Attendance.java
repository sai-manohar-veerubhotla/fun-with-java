package ca.javafunblog.maps;

import java.util.Locale;

public class Attendance {

    private String day;

    private int people;

    public Attendance(String day, int people) {
        this.day = day.toUpperCase(Locale.ROOT);
        this.people = people;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public int getPeople() {
        return people;
    }

    public void setPeople(int people) {
        this.people = people;
    }

    @Override
    public String toString() {
        return "Attendance{" +
                "day='" + day + '\'' +
                ", people=" + people +
                '}';
    }
}
