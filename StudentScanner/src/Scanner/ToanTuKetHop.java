package Scanner;

public class ToanTuKetHop {
    public static void main(String[] args) {
//        sử dụng &&
//        for (int i = 0; i < 100; i++) {
//            if (i %2 == 0 && i %5 == 0 && i %10 == 0) {
//                System.out.println(i);
//            }
//        }
//        sử dụng ||
//        for (int i = 0; i < 100; i++) {
//            if (i %20 == 0 || i %50 == 0 || i %33 == 0) {
//                System.out.println(i);
//            }
//        }
//        sử dụng !
        int a = 100;
        if (!(a %50 == 0)) {
            System.out.println("a chia hết cho 50: ");
        }
    }
}
