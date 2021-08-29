package Stratery;

public class Main {

    public static void main(String[] args) {
        SortedList sortedList = new SortedList();
        sortedList.add("Java");
        sortedList.add("PHP");
        sortedList.add("C#");
        sortedList.add("Python");

        sortedList.setSortTratery(new QuickSort());
        sortedList.sort();

        sortedList.setSortTratery(new MergeSort());
        sortedList.sort();
    }
}
