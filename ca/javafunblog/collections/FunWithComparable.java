package ca.javafunblog.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FunWithComparable {
    private void fun() {
        List<Student> students = new ArrayList<>();
        // vamsi, manohar
        Student vamsi = new Student(26, "Vamsi");
        Student manohar = new Student(25, "Manohar");
        Student alexa = new Student(2, "Alexa");
        students.add(vamsi);
        students.add(manohar);
        students.add(alexa);
        System.out.println("students: " + students);

        Collections.sort(students);
//        System.out.println("students sorted by age: " + students);
        System.out.println("students sorted by name: " + students);
    }

    public static void main(String[] args) {
        FunWithComparable funWithComparable = new FunWithComparable();
        funWithComparable.fun();
    }


    class Student implements Comparable<Student> {

        // equal -> 0
        // age < newParam -> less than 0
        // age > newParam -> greater than 0

        @Override
        public int compareTo(Student student) {
//            return Integer.valueOf(age).compareTo(student.getAge());
            return name.compareTo(student.getName());
        }

        private int age;

        private String name;

        public Student(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "age=" + age +
                    ", name='" + name + '\'' +
                    '}';
        }
    }


}
