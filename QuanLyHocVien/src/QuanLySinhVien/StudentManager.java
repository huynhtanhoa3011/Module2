package QuanLySinhVien;

import java.io.*;
import java.util.*;

public class StudentManager {
    private static int id = 0;
    static int count = 0;
    static CheckInput checkInput = new CheckInput();
    static List<Student> studentList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choose;
        do {
            showMenu();
            choose = checkInput.checkInteger(1, 10);
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
//        int n = sc.nextInt(); không giới hạn số lần nhập
        int n = checkInput.checkInteger(1, 50);
        for (int i = 0; i < n; i++) {
            id = ++count;
            System.out.print("name " + id + ":\t");
            String name = checkInput.checkString();
            System.out.print("oralTest: ");
            Double oralTest = checkInput.checkDouble(0, 10);
            System.out.print("Test15: ");
            Double Test15 = checkInput.checkDouble(0, 10);
            System.out.print("Test45: ");
            Double Test45 = checkInput.checkDouble(0, 10);
            System.out.print("semesterTest: ");
            Double semesterTest = checkInput.checkDouble(0, 10);
            studentList.add(new Student(name, oralTest, Test15, Test45, semesterTest));
        }
    }

    private static void editStudentById() {
        System.out.print("Nhập ID học viên cần chỉnh sửa: ");
        int idStudent = checkInput.checkInteger(1, studentList.size());
        for (int i = 0; i < studentList.size(); i++) {
            if (idStudent == studentList.get(i).getId()) {
                System.out.print("name: ");
                studentList.get(i).setName(checkInput.checkString());
                System.out.print("oralTest: ");
                studentList.get(i).setOralTest(checkInput.checkDouble(0, 10));
                System.out.print("Test15: ");
                studentList.get(i).setTest15(checkInput.checkDouble(0, 10));
                System.out.print("Test45: ");
                studentList.get(i).setTest45(checkInput.checkDouble(0, 10));
                System.out.print("semesterTest: ");
                studentList.get(i).setSemesterTest(checkInput.checkDouble(0, 10));
                break;
            }
        }
        System.out.println("\n\t\t==========================================DANH SÁCH HỌC VIÊN SAU KHI SỬA==============================================");
        System.out.println("\n\t\tTên                        ID         OralTest        Test15         Test45      semesterTest     MediumTest");
        for (Student student : studentList) {
            student.display();
        }
        System.out.println("\n\t\t=======================================================================================================================");
        System.out.println();
    }

    private static void deleteStudentById() {
        System.out.print("Nhập ID sinh viên cần xóa: ");
        int id = checkInput.checkInteger(1, studentList.size());
        for (Student student : studentList) {
            if (student.getId() == id) {
                studentList.remove(student);
                break;
            }
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
        System.out.print("Nhập ID học viên cần chỉnh sửa: ");
        int idStudent = checkInput.checkInteger(1, studentList.size());
        for (int i = 0; i < studentList.size(); i++) {
            if (idStudent == studentList.get(i).getId()) {
                System.out.print("oralTest:  ");
                studentList.get(i).setOralTest(sc.nextDouble());
                System.out.print("Test15:  ");
                studentList.get(i).setTest15(sc.nextDouble());
                System.out.print("Test45:  ");
                studentList.get(i).setTest45(sc.nextDouble());
                System.out.print("semesterTest:  ");
                studentList.get(i).setSemesterTest(sc.nextDouble());
                break;
            }
        }
        System.out.println("\n\t\t==========================================DANH SÁCH HỌC VIÊN SAU KHI SỬA ĐIỂM==========================================");
        System.out.println("\n\t\tTên                        ID         OralTest        Test15         Test45      semesterTest     MediumTest");
        for (Student student : studentList) {
            student.display();
        }
        System.out.println("\n\t\t=======================================================================================================================");
        System.out.println();
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
        System.out.print("Nhập tên học viên cần tìm: ");
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
        System.out.println("=====================MENU==================");
        System.out.println("|   1. Danh sách học viên                 |");
        System.out.println("|   2. Thêm học viên                      |");
        System.out.println("|   3. Sửa thông tin học viên theo id     |");
        System.out.println("|   4. Xóa học viên theo id               |");
        System.out.println("|   5. Sửa điểm học viên                  |");
        System.out.println("|   6. Sắp xếp học viên                   |");
        System.out.println("|   7. Tìm kiếm học viên                  |");
        System.out.println("|   8. Lưu file                           |");
        System.out.println("|   9. Đọc file                           |");
        System.out.println("|   10. Thoát                             |");
        System.out.println("===========================================");
        System.out.print("Nhập lựa chọn của bạn: ");
    }
}
