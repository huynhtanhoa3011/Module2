import java.util.Scanner;

public class chuyendoitiente {
    public static void main(String[] args) {
        int rate = 23000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào USD: ");
        int dollar = scanner.nextInt();
        int vnd = rate * dollar;
        System.out.println(dollar + "=" + vnd + "vnd");
    }
}
