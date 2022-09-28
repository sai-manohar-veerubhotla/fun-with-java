package ca.javafunblog.oops.interfaces.class4;

public class IntermediatePerson {

    private int age;

    private String name;

    private boolean intermediate;

    public IntermediatePerson(int age, String name, boolean intermediate) {
        this.age = age;
        this.name = name;
        this.intermediate = intermediate;
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

    public boolean isIntermediate() {
        return intermediate;
    }

    public void setIntermediate(boolean intermediate) {
        this.intermediate = intermediate;
    }

    @Override
    public String toString() {
        return "IntermediatePerson{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", intermediate=" + intermediate +
                '}';
    }
}
