package Resizeable;

public class Main {

    public static void main(String[] args) {
        int x = (int) Math.floor(Math.random() * 10);
        Shape[]  shapes = new Shape[3];
        shapes[0] = new Circle("blue", false, x);
        shapes[1] = new Rectangle(x, x, "green");
        shapes[2] = new Square("red", true, x);
        for (Shape a : shapes) {
            System.out.println(a);
        }
        for (Shape a : shapes) {
            a.resize(Math.random() * 10);
        }
        System.out.println("\n");
        Shape.printShape(shapes);

    }
}
