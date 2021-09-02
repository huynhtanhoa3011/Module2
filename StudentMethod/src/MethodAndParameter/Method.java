package MethodAndParameter;

public class Method {

    public static void main(String[] args) {
        int a = 100;
        int b = 25;

        int tong = add(150, 35);
        System.out.println("tong = " + tong);

        int[] numbers = {12, 23, 34, 45, 56};

        float avg = average(numbers);
        System.out.println("giá trị trung bình: " + avg);
        findmax(120, 130, 500);
    }

    public static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static float average(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return (float) sum/arr.length;
    }

    public static void findmax(int a, int b, int c) {
        int max = a;
        if(max < b) {
            max = b;
        }
        if (max < c) {
            max = c;
        }
        System.out.println("Max = " + max);
    }
}
