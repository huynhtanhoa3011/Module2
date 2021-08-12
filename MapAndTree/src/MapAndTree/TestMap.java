package MapAndTree;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {

    public static void main(String[] args) {
//        tao HashMap de luu danh sach sinh vien
        Map<String, Integer> hasMap = new HashMap<>();
        hasMap.put("Hoa", 30);
        hasMap.put("Hoang", 28);
        hasMap.put("Hieu", 24);
        hasMap.put("Phuong", 24);
        System.out.println("Hien thi danh sach sinh vien trong HashMap");
        System.out.println(hasMap + "\n");
//          tao TreeMap de luu key theo thu tu giam dan
        Map<String, Integer> treeMap = new TreeMap<>(hasMap);
        System.out.println("Hien thi sinh vien theo thu tu tang dan");
        System.out.println(treeMap);
//          tao LinkedListMap luu danh sach sinh vien va hien thi du lieu
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Hoa", 30);
        linkedHashMap.put("Hoang", 28);
        linkedHashMap.put("Hieu", 24);
        linkedHashMap.put("Phuong", 24);
        System.out.println("\nTuoi cua Hieu la\t" + linkedHashMap.get("Hieu"));
    }
}
