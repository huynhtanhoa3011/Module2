package service;


import Repository.StudentRepository;
import model.Student;

import java.util.*;

public class StudentManager {
    private static int id = 0;
    static int count = 0;
    private CheckInput checkInput = new CheckInput();
    private List<Student> studentList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    private static StudentRepository studentRepository;

    public StudentManager() {
        studentRepository = new StudentRepository();
    }

    public static void showMenu() {
        System.out.println("=====================MENU==================");
        System.out.println("|   1. Danh sách học viên                 |");
        System.out.println("|   2. Thêm học viên                      |");
        System.out.println("|   3. Sửa thông tin học viên theo id     |");
        System.out.println("|   4. Xóa học viên theo id               |");
        System.out.println("|   5. Sửa điểm học viên                  |");
        System.out.println("|   6. Sắp xếp học viên                   |");
        System.out.println("|   7. Tìm kiếm học viên                  |");
        System.out.println("|   8. Thoát                              |");
        System.out.println("===========================================");
        System.out.print("Nhập lựa chọn của bạn: ");
    }

    public void displayStudent() {
        studentList = studentRepository.readFile();
        System.out.println("\n\t\t============================================DANH SÁCH HỌC VIÊN=============================================");
        System.out.println("\n\t\tTên                        ID         Điểm miệng        Điểm 15'        Điểm 45'       Điểm thi      Điểm TB");
        for (Student student : studentList) {
            student.display();
        }
        System.out.println("\n\t\t============================================================================================================");
        System.out.println();
    }

    public void addStudent() {
//        boolean check;
        do {
            Scanner sc = new Scanner(System.in);
            id = ++count;
            System.out.print("Tên "+ id + ":\t");
            String name = checkInput.checkString();
            System.out.print("Điểm miệng: ");
            Double oralTest = checkInput.checkDouble(0, 10);
            System.out.print("Điểm 15 phút: ");
            Double Test15 = checkInput.checkDouble(0, 10);
            System.out.print("Điểm 45 phút: ");
            Double Test45 = checkInput.checkDouble(0, 10);
            System.out.print("Điểm thi: ");
            Double semesterTest = checkInput.checkDouble(0, 10);

            Student student = new Student(name, id, oralTest, Test15, Test45, semesterTest);
            studentList.add(student);
            studentRepository.saveFile(studentList);

            System.out.print("Quay về danh sách(chọn y), tiếp tục nhập (chọn n) : ");
        } while (!sc.nextLine().equals("y"));
    }

    public void editStudent() {
        System.out.print("Nhập ID học viên cần chỉnh sửa: ");
        int idStudent = checkInput.checkInteger(1, studentList.size());
        for (int i = 0; i < studentList.size(); i++) {
            if (idStudent == studentList.get(i).getId()) {
                System.out.print("Tên: ");
                studentList.get(i).setName(checkInput.checkString());
                System.out.print("Điểm miệng: ");
                studentList.get(i).setOralTest(checkInput.checkDouble(0, 10));
                System.out.print("Điểm 15 phút: ");
                studentList.get(i).setTest15(checkInput.checkDouble(0, 10));
                System.out.print("Điểm 45 phút: ");
                studentList.get(i).setTest45(checkInput.checkDouble(0, 10));
                System.out.print("Điểm thi: ");
                studentList.get(i).setSemesterTest(checkInput.checkDouble(0, 10));
                studentRepository.saveFile(studentList);
                break;
            }
        }
        System.out.println("\n\t\t======================================DANH SÁCH HỌC VIÊN SAU KHI SỬA========================================");
        System.out.println("\n\t\tTên                        ID         Điểm miệng        Điểm 15'        Điểm 45'       Điểm thi      Điểm TB");
        for (Student student : studentList) {
            student.display();
        }
        System.out.println("\n\t\t============================================================================================================");
        System.out.println();
    }

    public void deleteStudent() {
        System.out.print("Nhập ID sinh viên cần xóa: ");
        int id = checkInput.checkInteger(1, studentList.size());
        for (Student student : studentList) {
            if (student.getId() == id) {
                studentList.remove(student);
                studentRepository.saveFile(studentList);
                break;
            }
        }
        System.out.println("\n\t\t=======================================DANH SÁCH HỌC VIÊN SAU KHI XÓA=======================================");
        System.out.println("\n\t\tTên                        ID         Điểm miệng        Điểm 15'        Điểm 45'       Điểm thi      Điểm TB");
        for (Student student : studentList) {
            student.display();
        }
        System.out.println("\n\t\t============================================================================================================");
        System.out.println();
    }

    public void editScore() {
        System.out.print("Nhập ID học viên cần chỉnh sửa: ");
        int idStudent = checkInput.checkInteger(1, studentList.size());
        for (int i = 0; i < studentList.size(); i++) {
            if (idStudent == studentList.get(i).getId()) {
                System.out.print("Điểm miệng:  ");
                studentList.get(i).setOralTest(sc.nextDouble());
                System.out.print("Điểm 15 phút:  ");
                studentList.get(i).setTest15(sc.nextDouble());
                System.out.print("Điểm 45 phút:  ");
                studentList.get(i).setTest45(sc.nextDouble());
                System.out.print("Điểm thi:  ");
                studentList.get(i).setSemesterTest(sc.nextDouble());
                studentRepository.saveFile(studentList);
                break;
            }
        }
        System.out.println("\n\t\t====================================DANH SÁCH HỌC VIÊN SAU KHI SỬA ĐIỂM=====================================");
        System.out.println("\n\t\tTên                        ID         Điểm miệng        Điểm 15'        Điểm 45'       Điểm thi      Điểm TB");
        for (Student student : studentList) {
            student.display();
        }
        System.out.println("\n\t\t============================================================================================================");
        System.out.println();
    }

    public void sortStudent() {
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getMediumTest() > o2.getMediumTest()) {
                    return -1;
                }
                return 1;
            }
        });
        System.out.println("\n\t\t===================================DANH SÁCH HỌC VIÊN SAU KHI SẮP XẾP=======================================");
        System.out.println("\n\t\tTên                        ID         Điểm miệng        Điểm 15'        Điểm 45'       Điểm thi      Điểm TB");
        for (Student student : studentList) {
            student.display();
            studentRepository.saveFile(studentList);
        }
        System.out.println("\n\t\t============================================================================================================");
        System.out.println();
    }

    public void findStudent() {
        String name;
        System.out.print("Nhập tên học viên cần tìm: ");
        name = sc.nextLine();
        System.out.println("\n\t\t========================================DANH SÁCH HỌC VIÊN SAU KHI TÌM======================================");
        System.out.println("\n\t\tTên                        ID         Điểm miệng        Điểm 15'        Điểm 45'       Điểm thi      Điểm TB");
        for (Student student : studentList) {
            if (name.equalsIgnoreCase(student.getName())) {
                student.display();
                System.out.println("\n\t\t=====================================================================================================");
                System.out.println();
                studentRepository.saveFile(studentList);
                break;
            }
        }
    }
}
