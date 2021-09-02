package MethodAndParameter;

public class Parametes {
    public static void main(String[] args) {
        int a = 20;
        add(a, 20);

        String[] arr = {"Trang", "Nam", "Nhung"};

        showInfo(arr, 62);

        float x = 125;
        float y = 50;

        float[]arrf = {25.25f, 65, 58};

//        addMultil(25.25f, 65, 58, 36f);
//        addMultil(25.25f, 65, 58, 36f, x, y);
        addMultil(arrf);
    }
    public static int add(int a, int b) {
        return a + b;
    }

    public static void showInfo(String[]str, int number) {
    }

    public static void addMultil (float...args) {
        float sum = 0;
        for (float arg : args) {
            sum += arg;
        }
        System.out.println("sum = " + sum);
    }

}
