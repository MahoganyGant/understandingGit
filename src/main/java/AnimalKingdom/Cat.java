package AnimalKingdom;

public class Cat extends Feline implements Pet{
    public Cat() {
    }

//    public Cat(String name) {
//        super(name);
//    }
//
//    public Cat(String name, String food) {
//        super(name, food);
//    }


    public void makeNoise() {
        System.out.println("Meow Meow");
    }
//
//    public void scratch(){
//        System.out.println("I scratch things");
//    }
//
//    @Override
//    public String toString() {
//        return " -> Name: " + this.getName() + "\n" + " -> Food: " + this.getFood() + " -> Sex: " + this.sex;
//
//    }

    @Override
    public void greetOwner() {
        System.out.println("rubs up against owner");
    }

    @Override
    public void printPetClassName() {
        Pet.super.printPetClassName();
    }
}
