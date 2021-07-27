import java.util.Scanner;

public class chisocannang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float weight, height, bmi;
        System.out.print("cân nặng của bạn (kg): ");
        weight = scanner.nextFloat();
        System.out.print("chiều cao của bạn (m): ");
        height = scanner.nextFloat();
        bmi = weight / (height * height);
        System.out.println(String.valueOf(bmi));

        if (bmi < 18) {
            System.out.print("thiếu cân");
        } else if (bmi < 25.0) {
            System.out.print("bình thường");
        } else if (bmi < 30.0) {
            System.out.print("quá béo");
        } else {
            System.out.print("béo phì");
        }
    }
}
