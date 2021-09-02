package Mang;

public class MangHaiChieu {
    public static void main(String[] args) {
        boolean[][] bools;
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
//        bools = new boolean[5][9];

//        bools[0][0] = true;
//        bools[2][8] = false;
        matrix[2][1] = 555;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println("");
        }
    }
}
