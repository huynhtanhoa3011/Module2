package OOP;

public class Main {

    public static void main(String[] args) {
	int[] array = new int[1000];
	StopWatch stopWatch = new StopWatch();
	try {
	    stopWatch.start();
        System.out.println("bắt đầu: " + stopWatch.getStartTime());
        System.out.println("\ntrước: ");
        for (int value : randomNumber(array)) {
            System.out.print(value + " ");
        }
        System.out.println("\nsau: ");
        for (int value : selectionSort(array)) {
            System.out.println(value + " ");
        }
        stopWatch.end();
        System.out.println("\nkết thúc: " + stopWatch.getEndTime());
        System.out.println("\nlượng thờ gian đã trôi qua: " + stopWatch.getElapsedTime());

    } catch (Exception ex) {
        System.out.println(ex.getMessage());
    }
    }
    public static int[] selectionSort(int[]array) {
        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[i]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
    public static int[] randomNumber(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100000);
        }
        return array;
    }
}
