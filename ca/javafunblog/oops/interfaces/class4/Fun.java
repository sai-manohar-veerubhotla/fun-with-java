package ca.javafunblog.oops.interfaces.class4;

public class Fun {

    // process -> ModifiedPerson
    public ModifiedPerson process(Person person) {
        ModifiedPerson modifiedPerson;
        if (person.getAge() < 18) {
            modifiedPerson = new ModifiedPerson(person.getAge(),
                    person.getName(), "MINOR");
        } else {
            modifiedPerson = new ModifiedPerson(person.getAge(),
                    person.getName(), "NOT_A_MINOR");
        }

        return modifiedPerson;
    }

    // process Person -> IntermediatePerson -> ModifiedPerson


    public ModifiedPerson process2(Person person) {
        IntermediatePerson intermediatePerson =
                new IntermediatePerson(person.getAge(), person.getName(), true);
        System.out.println(intermediatePerson);
        ModifiedPerson modifiedPerson;
        if (intermediatePerson.getAge() < 18) {
            modifiedPerson = new ModifiedPerson(intermediatePerson.getAge(),
                    intermediatePerson.getName(), "MINOR");
        } else {
            modifiedPerson = new ModifiedPerson(intermediatePerson.getAge(),
                    intermediatePerson.getName(), "NOT_A_MINOR");
        }

        return modifiedPerson;

    }

    public ModifiedPerson process3(Person person) {
        IntermediatePersonInner intermediatePersonInner =
                new IntermediatePersonInner(person.getAge(), person.getName(),
                        true);
        System.out.println(intermediatePersonInner);
        ModifiedPerson modifiedPerson;
        if (intermediatePersonInner.getAge() < 18) {
            modifiedPerson = new ModifiedPerson(intermediatePersonInner.getAge(),
                    intermediatePersonInner.getName(), "MINOR");
        } else {
            modifiedPerson = new ModifiedPerson(intermediatePersonInner.getAge(),
                    intermediatePersonInner.getName(), "NOT_A_MINOR");
        }

        return modifiedPerson;

    }

    public static void main(String[] args) {
        Fun fun = new Fun();
        Person person = new Person(21, "SomeName");
        ModifiedPerson modifiedPerson = fun.process(person);
        System.out.println(modifiedPerson);

        System.out.println(fun.process2(new Person(15, "realName")));
        System.out.println(fun.process3(new Person(50, "oldName")));
    }



    private class IntermediatePersonInner{
        private int age;

        private String name;

        private boolean intermediate;

        public IntermediatePersonInner(int age, String name, boolean intermediate) {
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
            return "IntermediatePersonInner{" +
                    "age=" + age +
                    ", name='" + name + '\'' +
                    ", intermediate=" + intermediate +
                    '}';
        }
    }


}
