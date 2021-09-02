package TuKhoaThis;

public class StudentTest {
    public static void showStudentInfo(Student student) {
        System.out.println("Name: " + student.getName());
        System.out.println("ID: " + student.getId());
        System.out.println("Email: " + student.getEmail());
        System.out.println("Age: " + student.getAge());
        System.out.println("Mark: " + student.getMark());
        System.out.println("Married: " + student.isMarried());
    }
}
