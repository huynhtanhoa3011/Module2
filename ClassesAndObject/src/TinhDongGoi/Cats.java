package TinhDongGoi;

public class Cats {
    private String name;
    private int age;
    private float weight;
    private String color;
    private String eyesColor;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void speak() {
        System.out.println(name + "is peaking");
    }

    public void move () {
        System.out.println(name + "is running");
    }

    public void eat () {
        System.out.println(name + "is chew");
    }
}
