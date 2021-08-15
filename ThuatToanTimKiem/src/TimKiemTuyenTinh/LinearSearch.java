package TimKiemTuyenTinh;

public class LinearSearch {
    public static int linearSearch(int[] array, int value) {
        int index = -1;
        for (int  i = 0; i < array.length; i++) {
            if (value == array[i]) {
                index = i;
                break;
            }
        }
        return index;
    }

}
