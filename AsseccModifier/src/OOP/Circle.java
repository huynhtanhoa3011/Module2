package OOP;

public class Circle {
    double PI = 3.141592;
 public double radius = 1.0;
 public String color = "red";

 public Circle () {}
    public Circle (double r) {
     this.radius = r;
    }
    public double getRadius() {
     return radius;
    }
    public double getArea () {
     return this.radius * this.radius * PI;
    }

}
