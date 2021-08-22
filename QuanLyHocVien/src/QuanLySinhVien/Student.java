package QuanLySinhVien;

import java.util.Scanner;

public class Student {
    static int count = 0;
    private int id = 0;
    private String name;
    private double oralTest;
    private double Test15;
    private double Test45;
    private double semesterTest;
    private double mediumTest;

    public Student() {
        id = ++count;
    }

    public Student(String name, double oralTest, double test15, double test45, double semesterTest) {
        this.name = name;
        this.oralTest = oralTest;
        this.Test15 = test15;
        this.Test45 = test45;
        this.semesterTest = semesterTest;
        id = ++count;

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

    public void setId(int id) {
        this.id = id;
    }

    public double getOralTest() {
        return oralTest;
    }

    public void setOralTest(double oralTest) {
        this.oralTest = oralTest;
    }

    public double getTest15() {
        return Test15;
    }

    public void setTest15(double test15) {
        Test15 = test15;
    }

    public double getTest45() {
        return Test45;
    }

    public void setTest45(double test45) {
        Test45 = test45;
    }

    public double getSemesterTest() {
        return semesterTest;
    }

    public void setSemesterTest(double semesterTest) {
        this.semesterTest = semesterTest;
    }

    public double getMediumTest() {
        return (oralTest + Test15 + Test45 * 2 + semesterTest * 3) / 7;
    }

    public void display() {
        System.out.printf("\n\t\t%-26s %-12d %-14.1f %-14.1f %-14.1f %-14.1f %-14.1f", name, id, oralTest, Test15, Test45, semesterTest,this.getMediumTest());
    }

    @Override
    public String toString() {
        return String.format("\n\t\t%-26s %-12d %-14.1f %-14.1f %-14.1f %-14.1f %-14.1f", name, id, oralTest, Test15, Test45, semesterTest,this.getMediumTest());
    }
}
