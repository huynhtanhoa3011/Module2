package SapXepChen;

public class InsertionSort {
    public static void main(String[] args) {
        int[] list = {1, 5, -2, 4, 13, 11, 8, -4};
        printArray(list);

        for (int i = 0; i < list.length; i++) {
            int temp = list[i];
            int j = i - 1;

            while (j >= 0 && temp < list[j]) {
                list[j + 1] = list[j];
                j--;
            }
            list[j + 1] = temp;
        }
        printArray(list);
    }
    private static void printArray(int[] x) {
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println();
    }
}
