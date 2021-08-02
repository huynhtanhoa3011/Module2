package OOP;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println();

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle(3.5, "yellow", false);
        System.out.println(circle);
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area is: " + circle.getArea());
        System.out.println("Perimetes is: " + circle.getPerimetes());
    }
}
