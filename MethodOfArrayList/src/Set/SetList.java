package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetList {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("E");
        set.add("F");
        System.out.println(set);
//        set.remove("D");
//        System.out.println("After inserted");
//
//        for (String s : set) {
//            System.out.println(s);
//        }

        Iterator<String> itr = set.iterator();

        while (itr.hasNext()) {
            String s = itr.next();
            if (s.equals("D")) {
                itr.remove();
            }
        }

//        for (String item : set) {
//            if  (item.equals("D")) {
//                set.remove(item);
//            }
//        }

        System.out.println("After deleted");
        for (String s : set) {
            System.out.println(s);
        }

    }
}
