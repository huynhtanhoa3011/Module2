package Mang;

public class ForEach {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        String[] friends = {"Hoa", "Hieu", "Hoang", "Hai"};
        float[] marks = {6.5f, 7.5f, 8.0f, 9.25f};

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
        System.out.println("===============");
        for (float mark : marks) {
            mark = 2 * mark;
            System.out.println(mark);
        }
        System.out.println("===============");
        for (String friend : friends) {
            System.out.println(friend);
        }
        System.out.println("===============");
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("sum = " + sum);


        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        matrix[1][2] = 666;
        System.out.println("===============");
        for (int[] m : matrix) {
            for (int i : m) {
                System.out.print(i + " ");
            }
            System.out.println("");
        }
    }
}
