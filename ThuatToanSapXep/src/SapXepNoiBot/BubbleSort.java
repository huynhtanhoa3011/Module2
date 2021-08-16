package SapXepNoiBot;

public class BubbleSort {
//    khai báo mảng số nguyên chưa sắp xếp
    static int[] list = {2, 3, 2, 5, 6, 1, -2, 14, 12};
//      cài đặt phương thức bubbleSort(int[]list)
    public static void bubbleSort(int[] list) {
        boolean needNextPass = true;

        for (int k = 1; k < list.length && needNextPass; k++) {
//            mảng có thể được sắp xếp mà không cần chuyển tiếp
            needNextPass = false;
            for (int i = 0; i < list.length -k; i++) {
                if (list[i] > list[i + 1]) {
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;

                    needNextPass = true;
                }
            }
        }
    }
// cài đặt phương thức main để thực thi ứng dụng
    public static void main(String[] args) {
        bubbleSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }
}
