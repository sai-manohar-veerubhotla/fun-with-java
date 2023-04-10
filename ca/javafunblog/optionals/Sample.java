package ca.javafunblog.optionals;

import java.util.Optional;

public class Sample {

    private int anInt;

    private Optional<String> aString;

    public Sample(int anInt, Optional<String> aString) {
        this.anInt = anInt;
        this.aString = aString;
    }

    public int getAnInt() {
        return anInt;
    }

    public Optional<String> getaString() {
        return aString;
    }
}
