package superheroes;

import java.io.ObjectInputStream;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface SuperheroManager {

    @SuppressWarnings("unchecked")
    default List<Superhero> getSuperheroes() {
        try (ObjectInputStream in = new ObjectInputStream(SuperheroManager.class.getResourceAsStream("/superheroes/superheroes.ser"))) {
            return (List<Superhero>) in.readObject();
        } catch (Exception e) {
            throw new AssertionError("Failed to load objects");
        }
    }

    /**
     * Returns the strongest superhero wrapped in an {@code Optional} object, grouped by alignment.
     *
     * @return the strongest superhero wrapped in an {@code Optional} object, grouped by alignment
     */
    Map<Superhero.Alignment, Optional<Superhero>> strongestHeroByAlignment();

    /**
     * Prints the name and speed of the ten fastest superheroes published by "Marvel Comics".
     */
    void tenFastestMarvelHeroes();

    /**
     * Returns the names and first appearances of all heroes who have a durability over 80 and intelligence under 20.
     *
     * @return the names and first appearances of all heroes who have a durability over 80 and intelligence under 20
     */
    Map<String, String> durableDumbHeroes();

    /**
     * Returns if there is at least one superhero whose number of aliases is greater than their power rating.
     *
     * @return if there is at least one superhero whose number of aliases is greater than their power rating
     */
    boolean moreAliasesThanPower();

    /**
     * Returns the shortest alias a female superhero has.
     *
     * @return the shortest alias a female superhero has
     */
    String shortestFemaleAlias();
}