public class Giatrinhonhattrongmang {
    public static void main(String[] args) {
//        khởi tạo mảng
        int[] arr = {5, 15, 8, -3, -5, 4, 7, 9, 1, -1};
        int index = minValue(arr);
        System.out.println("giá trị nhỏ nhất trong mảng là: " + arr[index]);
    }
//    triển khai phương thức
    public static int minValue(int[] array) {
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }
}
