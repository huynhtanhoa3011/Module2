package Mang;

public class MangMotChieu {

    public static void main(String[] args) {
	int[] numbers = {1, 2, 3, 4, 5};
	String[] friends = {"Nam", "Hoa", "Hieu", "Hai"};
	float[] marks = {6.5f, 7.25f, 8.5f, 9.0f} ;

//        System.out.println("độ dài: " + numbers.length);
//        System.out.println("độ dài: " + frients.length);
//        System.out.println("độ dài: " + marks.length);

//        System.out.println(friends[3]);
//        System.out.println(marks[2]);
//
//        friends[3] = "Son";
//        System.out.println(friends[3]);
//
//        for (int i = 0; i < friends.length; i++) {
//            System.out.println("friends ["+ i +"]: " + friends[i]);
//        }
        int[] array = new int[100];
        System.out.println(array[10]);
        System.out.println(array[20]);

        String[] str = new String[300];
        System.out.println(str[2]);

        boolean[] bools = new boolean[200];
        bools[1] = true;
        bools[25] = false;
        System.out.println(bools[1]);
    }
}
