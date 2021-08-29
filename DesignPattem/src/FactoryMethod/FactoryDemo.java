package FactoryMethod;

public class FactoryDemo {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";

    public static void main(String[] args) {
	AnimalFactory animalFactory = new AnimalFactory();

	Animal a1 = animalFactory.getAnimal("feline");
        System.out.println(ANSI_RED + "a1 sound: " + ANSI_GREEN + a1.makeSound());

        Animal a2 = animalFactory.getAnimal("canine");
        System.out.println(ANSI_GREEN + "a2 sound: " + ANSI_RED + a2.makeSound());
    }
}
