import java.util.Scanner;

public class Timgiatritrongmang {
    public static void main(String[] args) {
//        khai báo mảng
        String[] students = {"Phuong","Hoa","Hoang","PhanAnh","Hieu"};
//        khai báo biến và gán giá trị
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name student: ");
        String input_name = scanner.nextLine();
//        sử dụng vòng lặp for để duyệt mảng
        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_name)) {
                System.out.println("position of the student in the list " + input_name + "is: " + (i + 1));
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Not found" + input_name + "in the list.");
        }
    }
}
