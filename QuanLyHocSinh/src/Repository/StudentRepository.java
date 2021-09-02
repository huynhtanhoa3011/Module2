package Repository;

import model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
    public static void saveFile(List<Student> studentList) {
        try {
            File file = new File("src\\data\\students.csv");
            FileWriter fileWriter = new FileWriter(file, false);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Student student : studentList) {
                bufferedWriter.write(student.getName() +
                        ", " + student.getId() +
                        ", " + student.getOralTest() +
                        ", " + student.getTest15() +
                        ", " + student.getTest45() +
                        ", " + student.getSemesterTest() +
                        ", " + student.getMediumTest() + "\n");
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Student> readFile() {
        List<Student> students = new ArrayList<>();
        try {
            File file = new File("src\\data\\students.csv");
            if (!file.exists()) {
                return students;
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null && !line.isEmpty()) {
                String[] student = line.split("\\, ");
                Student student1 = new Student();
                student1.setName(student[0]);
                student1.setId(Integer.parseInt(student[1]));
                student1.setOralTest(Double.parseDouble(student[2]));
                student1.setTest15(Double.parseDouble(student[3]));
                student1.setTest45(Double.parseDouble(student[4]));
                student1.setSemesterTest(Double.parseDouble(student[5]));
                students.add(student1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return students;
    }
}



