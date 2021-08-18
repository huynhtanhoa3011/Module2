package QuanLySinhVien;

import java.io.*;
import java.util.*;

public class StudentManager {
    static List<Student> studentList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choose;
        do {
            showMenu();
            choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:
                    displayStudent();
                    break;
                case 2:
                    addStudent();
                    break;
                case 3:
                    editStudentById();
                    break;
                case 4:
                    deleteStudentById();
                    break;
                case 5:
                    editScoreStudent();
                    break;
                case 6:
                    rankStudent();
                    break;
                case 7:
                    findStudent();
                    break;
                case 8:
                    saveFile(studentList);
                    break;
                case 9:
                    readFile();
                    break;
                case 10:
                    System.out.println("Thoát!!!");
                    break;
                default:

            }
        } while (choose != 10);
    }

    private static void displayStudent() {
        System.out.println("\n\t\t============================================DANH SÁCH HỌC VIÊN=============================================");
        System.out.println("\n\t\tTên                        ID         OralTest        Test15         Test45      semesterTest     MediumTest");
        for (Student student : studentList) {
            student.display();
        }
        System.out.println("\n\t\t============================================================================================================");
        System.out.println();
    }

    private static void addStudent() {
        System.out.print("Nhập số sinh viên cần thêm: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            Student student = new Student();
            student.input();

            studentList.add(student);
        }
    }

    private static void editStudentById() {
        int idStudent;
        int count = 0;
        System.out.println("Nhập ID sinh viên cần sửa: ");
        int id = Integer.parseInt(sc.nextLine());
        for (Student student : studentList) {
            if (student.getId() == id) {
                student.input();
                count++;
                break;
            }
        }
        if (count == 0) {
            System.out.println("\tID không tồn tại!!!");
        }
        System.out.println("\n\t\t============================================DANH SÁCH HỌC VIÊN SAU KHI SỬA=============================================");
        System.out.println("\n\t\tTên                        ID         OralTest        Test15         Test45      semesterTest     MediumTest");
        for (Student student : studentList) {
            student.display();
        }
        System.out.println("\n\t\t=======================================================================================================================");
        System.out.println();
    }

    private static void deleteStudentById() {
        int idStudent;
        int count = 0;
        System.out.println("Nhập ID sinh viên cần xóa: ");
        int id = Integer.parseInt(sc.nextLine());
        for (Student student : studentList) {
            if (student.getId() == id) {
                studentList.remove(student);
                count++;
                break;
            }
        }
        if (count == 0) {
            System.out.println("\tID không tồn tại!!!");
        }
        System.out.println("\n\t\t============================================DANH SÁCH HỌC VIÊN SAU KHI XÓA=============================================");
        System.out.println("\n\t\tTên                        ID         OralTest        Test15         Test45      semesterTest     MediumTest");
        for (Student student : studentList) {
            student.display();
        }
        System.out.println("\n\t\t=======================================================================================================================");
        System.out.println();
    }

    private static void editScoreStudent() {
        System.out.println("ID: ");
        int id = sc.nextInt();
        for(Student o : studentList) {
            if(o.getId() == id) {
                System.out.println(o.toString());
            }
        }
    }

    private static void rankStudent() {
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getMediumTest() > o2.getMediumTest()) {
                    return -1;
                }
                return 1;
            }
        });
        System.out.println("\n\t\t==========================================DANH SÁCH HỌC VIÊN SAU KHI SẮP XẾP===========================================");
        System.out.println("\n\t\tTên                        ID         OralTest        Test15         Test45      semesterTest     MediumTest");
        for (Student student : studentList) {
            student.display();
        }
        System.out.println("\n\t\t=======================================================================================================================");
        System.out.println();
    }

    private static void findStudent() {
        String name;
        System.out.print("Nhập tên sinh viên cần tìm: ");
        name = sc.nextLine();
        System.out.println("\n\t\t======================================DANH SÁCH HỌC VIÊN ĐÃ TÌM KIẾM========================================");
        System.out.println("\n\t\tTên                        ID         OralTest        Test15         Test45      semesterTest     MediumTest");
        for (Student student : studentList) {
            if (name.equalsIgnoreCase(student.getName())) {
                student.display();
                System.out.println("\n\t\t=====================================================================================================");
                System.out.println();
                break;
            }
        }
    }

    private static void saveFile(List<Student> studentList) {
        try {
            FileWriter file = new FileWriter("studentList.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(file);
            for (Student student : studentList) {
                bufferedWriter.write(student.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            file.close();
        } catch (Exception e) {

        }
    }

    private static void readFile() {
        List<Student> studentList = new ArrayList<>();
        String line;
        try {
            FileReader file = new FileReader("studentList.txt");
            BufferedReader bufferedReader = new BufferedReader(file);
            showMenu();
            do {
                line = bufferedReader.readLine();
                System.out.println(line);


            } while (line != null);
            bufferedReader.close();
            file.close();
        } catch (Exception e) {

        }
    }

    static void showMenu() {
        System.out.println("=============MENU=================");
        System.out.println("1. Danh sách học viên");
        System.out.println("2. Thêm học viên");
        System.out.println("3. Sửa thông tin học viên theo id");
        System.out.println("4. Xóa học viên theo id");
        System.out.println("5. Sửa điểm học viên");
        System.out.println("6. Sắp xếp học viên");
        System.out.println("7. Tìm kiếm học viên");
        System.out.println("8. Lưu file");
        System.out.println("9. Đọc file");
        System.out.println("10. Thoát");
        System.out.println("=================================");
        System.out.print("Nhập lựa chọn của bạn: ");
    }
}
