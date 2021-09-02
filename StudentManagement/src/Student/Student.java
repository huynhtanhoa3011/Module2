package Student;

import java.util.Scanner;

public class Student {
    private String name;
    private int id;
    private int age;
    private String address;
    private double toan;
    private double ly;
    private double hoa;
    private double anh;

    public Student() {
    }

    public Student(String name, int id, int age, String address, double toan, double ly, double hoa, double anh) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.address = address;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
        this.anh = anh;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge() {
        this.age = age;
    }

    public String getAddress (){
        return address;
    }

    public void setAddress() {
        this.address = address;
    }

    public double getToan() {
        return toan;
    }

    public void setToan(double toan) {
        this.toan = toan;
    }

    public double getLy() {
        return ly;
    }

    public void setLy(double ly) {
        this.ly = ly;
    }

    public double getHoa() {
        return hoa;
    }

    public void setHoa(double hoa) {
        this.hoa = hoa;
    }

    public double getAnh() {
        return anh;
    }

    public void setAnh(double anh) {
        this.anh = anh;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên: ");
        name = sc.nextLine();

        System.out.println("Nhập id: ");
        id = sc.nextInt();

        System.out.println("Nhap tuoi: ");
        age = sc.nextInt();

        System.out.println("Nhap dia chi: ");
        address = sc.nextLine();

        System.out.println("Nhập điểm toán: ");
        toan = sc.nextDouble();

        System.out.println("Nhập điểm lý: ");
        ly = sc.nextDouble();

        System.out.println("Nhập điểm hóa: ");
        hoa = sc.nextDouble();

        System.out.println("Nhập điểm anh: ");
        anh = sc.nextDouble();

    }

    public String getFileLine() {
        return name + "," + id + "," + age + "," + address + "," + toan + "," + ly + "," + hoa + "," + anh + "\n";
    }

    public void display() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", address=" + address +
                ", toan=" + toan +
                ", ly=" + ly +
                ", hoa=" + hoa +
                ", anh=" + anh +
                '}';
    }
}
