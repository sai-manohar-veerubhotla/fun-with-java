package ca.javafunblog.oops.interfaces.class4;

public class ModifiedPerson{

    private int age;

    private String name;

    private String type;

    public ModifiedPerson(int age, String name, String type) {
        this.age = age;
        this.name = name;
        this.type = type;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "ModifiedPerson{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
