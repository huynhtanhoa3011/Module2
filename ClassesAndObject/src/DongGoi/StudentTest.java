package DongGoi;

public class StudentTest {
    public static void main(String[] args) {
        Student name = new Student();
        name.setName("Hoa");
        System.out.println(name.getName());

        name.setAge(30);
        System.out.println(name.getAge());

        name.getId(123567);
        System.out.println(name.getId());

    }
}
