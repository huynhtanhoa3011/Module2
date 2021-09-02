package presentation;


import Repository.StudentRepository;
import model.Student;
import service.CheckInput;
import service.StudentManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static int count = 0;
    private int id = 0;

    static CheckInput checkInput = new CheckInput();
    static List<Student> studentList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        int choose;
        do {
            StudentManager.showMenu();
            choose = checkInput.checkInteger(1, 8);
            switch (choose) {
                case 1:
                   studentManager.displayStudent();
                    break;
                case 2:
                    studentManager.addStudent();
                    break;
                case 3:
                    studentManager.editStudent();
                    break;
                case 4:
                    studentManager.deleteStudent();
                    break;
                case 5:
                    studentManager.editScore();
                    break;
                case 6:
                    studentManager.sortStudent();
                    break;
                case 7:
                    studentManager.findStudent();
                    break;
                case 8:
                    System.out.println("Thoát!!!");
                    break;
                default:
            }
        } while (choose != 8);
    }
}
