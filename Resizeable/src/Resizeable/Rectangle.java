package Resizeable;

public class Rectangle extends Shape {
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle () {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public Rectangle(int x, int x1, String green) {
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea () {
        return width * length;
    }

    public double getPerimeter() {
        return 2 * (width + length);
    }
    @Override
    public String toString() {
        return "\nA Rectangle with width="
                + getWidth()
                + " and length="
                + getLength()
                + "\nwhich is a subclass of "
                + super.toString()
                + "\nArea=" +
                + getArea();
    }

    @Override
    public void resize(double percent) {
        this.length *= (percent / 200);
        this.width += (percent / 200);
    }
}
