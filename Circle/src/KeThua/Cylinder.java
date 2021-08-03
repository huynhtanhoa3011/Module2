package KeThua;

public class Cylinder extends Circle {
    private double radius = 4.0;
    private double height = 4.0;

    public Cylinder() {
    }
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
    public Cylinder(double radius, double height, String color, boolean filled) {
        super(radius, color, filled);
        this.height = height;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea() {
        return radius * radius * Math.PI * height;
    }
    @Override
    public String toString() {
        return "A Cylinder with height = "
                + getHeight() +
                ", which is a subclass of "
                + super.toString();
    }
}
