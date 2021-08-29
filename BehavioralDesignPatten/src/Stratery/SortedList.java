package Stratery;

import java.util.ArrayList;
import java.util.List;

public class SortedList {
    private SortTratery stratery;
    private List<String> items = new ArrayList<>();

    public void setSortTratery(SortTratery stratery){
        this.stratery = stratery;
    }

    public void add(String name) {
        items.add(name);
    }

    public void sort() {
        stratery.sort(items);
    }
}
