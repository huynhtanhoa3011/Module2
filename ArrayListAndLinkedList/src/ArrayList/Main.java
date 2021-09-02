package ArrayList;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student("Hoa");
        Student student2 = new Student("Hoang");
        Student student3 = new Student("Hieu");
        Student student4 = new Student("Phuong");
        Student student5 = new Student("Phan Anh");

//        KHAI BÁO LIST

        List<Student> students = new java.util.ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        System.out.println("=====ArrayList=====");
        for (Student arr : students) {
            System.out.println(arr.getName());
        }
//        xóa phần tử trong mảng
        System.out.println("=====remove=====");
        students.remove(2);
        for (Student arr : students) {
            System.out.println(arr.getName());
        }

        //      SetList
        Set<String> set = new HashSet<>();
        set.add("Binh");
        set.add("Phong");
        set.add("An");
        System.out.println("=====Set=====");
        for (String s : set) {
            System.out.println(s);
        }

        System.out.println("=====removeSet=====");
        set.remove("Binh");
        for (String s : set) {
            System.out.println(s);
        }
    }
}
