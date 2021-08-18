package IOTestFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFileExample {
    public void readFileTest(String filePath) {
        try {
//            đọc file theo đường dẫn
            File file = new File(filePath);

//            kiểm tra nếu file không tồn tại thì ném ra ngoại lệ
            if (!file.exists()) {
                throw new FileNotFoundException();
            }

//            đọc từng dòng của fiel và tiến hành cộng tổng lại
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            br.close();

//            hiển thị ra màn hình tổng các số nguyên trong file
            System.out.println("Tổng = " + sum);

        } catch (Exception e) {
            System.out.println("File không tồn tại hoặc nội dung có lỗi");
        }
    }

    public static void main(String[] args) {
        System.out.print("Nhập đường dẫn file: ");
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();

        ReadFileExample readfileEx = new ReadFileExample();
        readfileEx.readFileTest(path);
    }
}

