

/**
 * The Pig class represents a pig pet in the game.
 * It extends the Pet class and provides specific behaviors for pig pets.
 */
public class Pig extends Pet {

    /**
     * Creates a pig pet with the specified name.
     * @param name the name of the pig pet.
     */
    public Pig(String name) {
        super(name, PetType.PIG); // Assuming PetType.PIG is defined in the PetType enum
    }

    /**
     * Makes a sound specific to a pig and overrides the makeSound method in the Pet class.
     */
    @Override
    public void makeSound() {
        System.out.println(name + " says: Oink Oink! Hello there!");
    }

    /**
     * Allows the pig to roll in the mud, increasing happiness by 10
     * and decreasing the energy level by 10 after playing.
     */
    public void rollInMud() {
        if (energy >= 10) {
            happiness += 10;
            energy -= 10;
            if (happiness > 100) happiness = 100;
            System.out.println(name + " is happily rolling in the mud. Happiness: " + happiness + ", Energy: " + energy);
        } else {
            System.out.println(name + " is too tired to roll in the mud.");
        }
    }
}
