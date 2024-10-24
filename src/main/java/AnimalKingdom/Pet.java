package AnimalKingdom;

public interface Pet {
    public abstract void greetOwner();

    default void printPetClassName() {
        System.out.println(this.getClass().getSimpleName());
    }

    //static methods
    static void printPetGreetings(Pet[] pets) {
        for (Pet pet : pets) {
            pet.printPetClassName();
//            pet.greetowner();
        }
    }
}

