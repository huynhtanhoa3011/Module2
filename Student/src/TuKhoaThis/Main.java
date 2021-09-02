package TuKhoaThis;

public class Main {
    public static void main(String[] args) {
        Student s = new Student("Huỳnh Tấn Hòa", "c0621h1", "huynhtanhoa171018@gmail.com", 30, 50, true) ;
        s.showMe();

        System.out.println("======================");
        Student s2 = s.getCurrentstudent();
        s2.showMe();
    }
}
