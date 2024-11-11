

/**
 * The Griffon class represents a griffon pet in the game.
 * The Griffon has unique behaviors, including making a specific sound and playing fetch.
 */
public class Griffon extends Pet {

    /**
     * Creates a griffon pet with the specified name.
     * @param name the name of the griffon pet.
     */
    public Griffon(String name) {
        super(name, PetType.GRIFFON); // Assuming PetType.GRIFFON is defined in the PetType enum
    }

    /**
     * Makes a sound specific to a griffon pet and overrides the makeSound method in the Pet class.
     */
    @Override
    public void makeSound() {
        System.out.println(name + " roars majestically: Grrrr... Screee!");
    }

    /**
     * Allows the griffon to play fetch, increasing happiness by 15 while the energy is greater than 15,
     * and decreasing the energy level of the pet by 15 after playing.
     */
    public void fetch() {
        if (energy >= 15) {
            happiness += 15;
            energy -= 15;
            if (happiness > 100) happiness = 100;
            System.out.println(name + " soared through the sky. Happiness: " + happiness + ", Energy: " + energy);
        } else {
            System.out.println(name + " is too exhausted to fly.");
        }
    }
}
