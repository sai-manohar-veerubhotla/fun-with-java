package ca.javafunblog.oops.innerclasses;

import java.time.LocalDateTime;

@FunctionalInterface
public interface Watch {

    LocalDateTime time(boolean showCorrectTime);
}
