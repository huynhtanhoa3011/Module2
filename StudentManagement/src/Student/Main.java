package Student;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.nio.charset.StandardCharsets.UTF_8;

public class Main {
    static List<Student> studentsList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int choose;

        do {
            showmenu();
            choose = Integer.parseInt(sc.nextLine());

            switch (choose) {
                case 1:
                    displayStudent();
                    break;
                case 2:
                    addStudentById();
                    break;
                case 3:
                    editStudenById();
                    break;
                case 4:
                    deleteStudentById();
                    break;
                case 5:
                    inputScoreById();
                    break;
                case 6:
                    editScoreById();
                    break;
                case 7:
                    rankStudent();
                    break;
                case 8:
                    save();
                    break;
                case 9:
                    System.out.println("Thoát");
                    break;
                default:
                    System.err.println("Nhập sai!");
                    System.out.println("Nhập lại!");
                    break;
            }
        } while (choose != 9);

        }

    private static void displayStudent() {
        for (Student student : studentsList) {
            student.display();
        }

    }

    private static void addStudentById() {
        System.out.println("Nhập số sinh viên cần thêm: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            Student student = new Student();
            student.input();

            studentsList.add(student);
        }
    }

    private static void editStudenById() {
        System.out.println("Nhập id sinh viên cần sửa: ");
        int id = Integer.parseInt(sc.nextLine());

        for (Student student : studentsList) {
            if (student.getId() == id) {
                student.input();
                break;
            }
        }

    }

    private static void deleteStudentById() {
        System.out.println("Nhập id sinh viên cần xóa: ");
        int id = Integer.parseInt(sc.nextLine());

        for (Student student : studentsList) {
            if (student.getId() == id) {
                studentsList.remove(student);
                break;
            }
        }
    }

    private static void inputScoreById() {
    }

    private static void editScoreById() {
    }

    private static void rankStudent() {
    }

    private static void save() throws IOException {
        System.out.println("Bắt đầu lưu");
        FileOutputStream fos = null;

        fos = new FileOutputStream("student.txt");

        for (Student student : studentsList) {
            String line = student.getFileLine();

            byte [] b = line.getBytes(UTF_8);

            fos.write(b);
        }
    }

    static void showmenu () {
        System.out.println("***********STUDENT***********");
        System.out.println("1. Danh sách học viên");
        System.out.println("2. Thêm học viên");
        System.out.println("3. Sửa thông tin học viên");
        System.out.println("4. Xóa học viên");
        System.out.println("5. Nhập điểm học viên");
        System.out.println("6. Sửa nhập điểm học viên");
        System.out.println("7. Xếp loại học viên");
        System.out.println("8. Lưu");
        System.out.println("9. Thoát");
        System.out.println("==========================");
        System.out.println("Nhập lựa chọn của bạn");
    }
}
