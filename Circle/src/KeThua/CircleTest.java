package KeThua;

public class CircleTest {

    public static void main(String[] args) {
	Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(6.5);
        System.out.println(circle);

        circle = new Circle(6.5, "blue", true);
        System.out.println(circle);
    }
}
