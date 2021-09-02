package OOP;

public class Main {

    public static void main(String[] args) {
	Dog Ruby = new Dog();
	Ruby.name = "Ruby";
	Ruby.age = 2;
	Ruby.weight = 5;
	Ruby.color = "yellow";
	Ruby.eyesColor = "green";

        System.out.println("dog is name: " + Ruby.name + "\nage: " + Ruby.age + "\ncolor: " + Ruby.color);
        Ruby.move();
        Ruby.eat();
        Ruby.speak();

    Dog Len = new Dog();
    Len.name = "Len";
    Len.age = 3;
    Len.color = "black";
    Len.eyesColor = "blue";

		System.out.println("\ndog is name: " + Len.name);
		Len.eat();
		Len.move();
		Len.speak();

    }
}
