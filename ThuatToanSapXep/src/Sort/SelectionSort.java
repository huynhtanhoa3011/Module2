package Sort;

import java.util.Arrays;
import java.util.List;

public class SelectionSort {
    public static void main(String[] args) {
//        int[] array = {2, 4, 3, 8, 6, 9, 7, 5};
//        Arrays.sort(array);
//        for (int x : array) {
//            System.out.print(x);
//        }
        List<Integer> array = Arrays.asList(2, 4, 3, 8, 6, 9, 7, 5);
        array.sort((o1, o2) -> o2 - o1);
        System.out.println(array);
    }
}
