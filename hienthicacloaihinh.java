public class hienthicacloaihinh {
    public static void main(String[] args) {
        String daw = "*";
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 15; j++) {
                System.out.print(daw + " ");
            }
            System.out.println(" ");
        }
        System.out.println("hình chữ nhật");
        System.out.println("-----------------------------");

        for (int k = 0; k < 10; k++) {
            for (int h = 0; h < k; h++) {
                System.out.print(daw);
            }
            System.out.println(" ");
        }
        System.out.println("tam giác vuông có cạnh góc vuông ở botton-left");
        System.out.println("-----------");

        for (int n = 0; n < 10; n++) {
            for (int m = 10; m > n; m--) {
                System.out.print(daw);
            }
            System.out.println(" ");
        }
        System.out.println("tam giác vuông có cạnh góc vuông ở top-left");
    }
}
