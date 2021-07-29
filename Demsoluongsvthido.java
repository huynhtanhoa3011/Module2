import java.util.Scanner;

public class Demsoluongsvthido {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size: ");
            size = scanner.nextInt();
            if (size > 30) ;
            System.out.println("size should not exceed 30");
        } while (size > 30);

        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.printf("\tEnter a mack for student " + (i + 1) + " : ");
            array[i] = scanner.nextInt();
            i++;
        }
        int count = 0;
        System.out.println("list of mark: ");
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j] + "\t");
            if (array[j] >= 5 && array[j] <= 10);
            count++;
        }
        System.out.println("\n the number of student passing the exam is " + count);
    }
}
