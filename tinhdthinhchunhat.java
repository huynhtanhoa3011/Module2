import java.util.Scanner;

public class tinhdthinhchunhat {
    public static void main(String[] args) {
        float widht;
        float height;
        Scanner scanner = new Scanner(System.in);   //  khai báo đối tượng Scanner
        System.out.println("Enter widht: ");
        widht = scanner.nextFloat();   //  nhập chiều dài

        System.out.println("Enter height: ");
        height = scanner.nextFloat();   //  nhập chiều rộng

        float area = widht * height;    // công thức
        System.out.println("Area = " + area);     // kết quả

    }
}
