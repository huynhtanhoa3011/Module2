import java.util.Scanner;

public class Gopmang {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 0};
        int[] newArray;
        int newArrayLength = array1.length + array2.length;
        Scanner scanner = new Scanner(System.in);
        newArray = new int[newArrayLength];
        int push = 0;

        System.out.printf("Mảng 1: ");
        for (int element: array1) {
            System.out.printf(element + " ");
            newArray[push] = element;
            push++;
        }
        System.out.printf("\nMảng 2: ");
        for (int element: array2) {
            System.out.printf(element + " ");
            newArray[push] = element;
            push++;
        }
        System.out.printf("\nMảng sau khi gộp: ");
        for (int element: newArray) {
            System.out.printf(element + " ");
        }
    }
}
