package superheroes;

import java.io.Serializable;
import java.util.List;

public record Superhero(
        String name,
        List<String> aliases,
        Alignment alignment,
        int durability,
        int intelligence,
        int power,
        int strength,
        int speed,
        Gender gender,
        String publisher,
        String firstAppearance
) implements Serializable {

    public enum Alignment {
        BAD,
        GOOD,
        NEUTRAL
    }

    public enum Gender {
        FEMALE,
        MALE
    }
}