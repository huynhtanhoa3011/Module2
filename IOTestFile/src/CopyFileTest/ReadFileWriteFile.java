package CopyFileTest;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFileWriteFile {
    public List<Integer> readFile(String filePath) {
        List<Integer> number = new ArrayList<>();
        try {
            File file = new File(filePath);

            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null) {
                number.add(Integer.parseInt(line));
            }
            br.close();
        } catch (Exception e) {
            System.out.println("File không tồn tại hoặc nội dung có lỗi!");
        }
        return number;
    }

    public void writeFile(String filePath, int max) {
        try {
            FileWriter writer = new FileWriter(filePath, true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write("giá trị lớm nhất là: " + max);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int findMax(List<Integer> number) {
        int max = number.get(0);
        for (int i = 0; i < number.size(); i++) {
            if (max < number.get(i)) {
                max = number.get(i);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        ReadFileWriteFile readAndWriteFile = new ReadFileWriteFile();
        List<Integer> number = readAndWriteFile.readFile("numbers.txt");
        int maxValue = findMax(number);
        readAndWriteFile.writeFile("result.txt", maxValue);
    }
}
