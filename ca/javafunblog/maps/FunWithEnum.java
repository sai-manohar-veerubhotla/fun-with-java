package ca.javafunblog.maps;

import java.util.HashSet;
import java.util.Set;

public class FunWithEnum {

    public static void main(String[] args) {
        // object creation
        Day day0 = Day.MONDAY;
        Day day1 = Day.TUESDAY;

        System.out.println(day0.ordinal());
        System.out.println(day1.ordinal());

    }

    private static void fun(){
        Set<Attendance> attendanceSet = new HashSet<>();
        Attendance monday = new Attendance("Monday", 5);
        attendanceSet.add(monday);
    }
}
