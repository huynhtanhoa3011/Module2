package Sort;

import java.util.Arrays;
import java.util.List;

public class InsertionSort {
    public static void main(String[] args) {
        List<Integer> array = Arrays.asList(2, 5, 3, 9, 6, 4, 8, 2, 7, 1);
        array.sort(((o1, o2) -> o1 - o2));
        System.out.println(array);
    }
}
