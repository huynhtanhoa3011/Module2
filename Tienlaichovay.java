import java.util.Scanner;

public class Tienlaichovay {
    public static void main(String[] args) {
        double tiengui = 1.0;
        int thanggui = 1;
        double laisuat = 1.0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhập số tiền gửi: ");
        tiengui = scanner.nextDouble();

        System.out.println("nhập số tháng gửi: ");
        thanggui = scanner.nextInt();

        System.out.println("nhập lãi suất theo tỷ lệ phần trăm: ");
        laisuat = scanner.nextDouble();

        double tongtienlai = 0;
        for (int i = 0; i < thanggui; i++) {
            tongtienlai += tiengui * (laisuat/100)/12 * thanggui;
        }
        System.out.println("tổng số tiền lãi: " + tongtienlai);
    }
}
