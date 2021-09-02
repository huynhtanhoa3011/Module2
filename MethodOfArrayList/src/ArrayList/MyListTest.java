package ArrayList;

import java.util.ArrayList;

public class MyListTest {

    public static void main(String[] args) {
        ArrayList<MyList> myLists = new ArrayList<>();
//        thêm phần tử vào trong arraylist

        myLists.add(new MyList());
        myLists.add(new MyList());
        myLists.add(new MyList());
        myLists.add(new MyList());
        myLists.add(new MyList());

        MyList a = myLists.get(0);

//        xóa 1 phần tử trong arraylist
//        myLists.remove(a);
//        xóa tất cả các phần tử
//        myLists.clear();
//        thay đổi phần tử
        myLists.set(1, new MyList());

        MyList[] arr = new MyList[5];
        myLists.toArray(arr);
        System.out.println("size of arraylist = " + myLists.size());
        System.out.println("size of array: " + arr.length);

    }
}
