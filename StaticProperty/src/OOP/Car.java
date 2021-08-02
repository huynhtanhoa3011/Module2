package OOP;

public class Car {
    private String name;
    private String engine;

    public static int numberofCar;

    public Car (String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberofCar++;
    }
}
