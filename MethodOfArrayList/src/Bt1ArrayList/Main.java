package Bt1ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyList myList1 = new MyList("Hoa");
        MyList myList2 = new MyList("Hoang");
        MyList myList3 = new MyList("Hieu");
        MyList myList4 = new MyList("Phuong");

//        khai báo list

        List<MyList> ml = new ArrayList<MyList>();

        ml.add(myList1);
        ml.add(myList2);
        ml.add(myList3);
        ml.add(myList4);
        System.out.println("========ArrayList=======");

        for (MyList arr : ml) {
            System.out.println(arr.getName());
        }
//        xóa phần tử trong list
        System.out.println("========================");
        ml.remove(2);
        for (MyList arr : ml) {
            System.out.println(arr.getName());
        }
//        System.out.println("=======================");
//        ml.remove(myList1);
//        for (MyList arr : ml) {
//            System.out.println(arr.getName());
//        }
    }
}
