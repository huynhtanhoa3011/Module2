package ComparableAndComparator;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Hoa", 30, "Hue");
        Student student1 = new Student("Hoang", 28, "Hue");
        Student student2 = new Student("Hieu", 24, "Hue");
        Student student3 = new Student("Phuong", 24, "Hue");

        List<Student> lists = new ArrayList<Student>();
        lists.add(student);
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        for (Student st : lists) {
            System.out.println(st.toString());
        }

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(lists, ageComparator);
        System.out.println("So sanh theo tuoi:");
        for (Student st : lists) {
            System.out.println(st.toString());
        }
    }
}

