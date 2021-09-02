package OOP;

public class CatTest {

    public static void main(String[] args) {
        Cat tom = new Cat();
        tom.name = "tom";
        tom.age = 6;

        System.out.println("cat's name: " + tom.name);
        tom.move();

        Cat Meoww = new Cat();
        Meoww.name = "Meoww\t";
        Meoww.age = 4;
        Meoww.color = "black";

        Meoww.move();
        Meoww.est();
        Meoww.speak();


    }
}
