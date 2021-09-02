package JavaCollection;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {

    public static void main(String[] args) {
        ArrayList collection1 = new ArrayList();
//        add() them phan tu vao collection
        collection1.add("Hoa");
        collection1.add("Hoang");
        collection1.add("Hieu");
        collection1.add("Phuong");

        System.out.println("Danh sach cac hoc vien trong bo suu tap:");
        System.out.println(collection1);

        System.out.println("Phan Anh co trong bo suu tap ko ?"
        + collection1.contains("Phan Anh"));

        Collection collection2 = new ArrayList<>();
        collection2.add("Binh");
        collection2.add("Chuong");

        System.out.println("Danh sach cac hoc vien trong bo suu tap2: ");
        System.out.println(collection2);
//        addAll() them tat ca cac phan tu
        ArrayList c1 = (ArrayList) collection1.clone();
        c1.addAll(collection2);
        System.out.println("hoc vien trong bo suu tap 1 hoac 2: ");
        System.out.println(c1);
//        retainAll giu lai cac phan tu
        c1 = (ArrayList) collection1.clone();
        c1.retainAll(collection2);
        System.out.println("hoc vien trong bo suu tap 1 va 2: ");
        System.out.println(c1);
//          removeAll() loai bo tat ca cac phan tu da chi dinh
        c1 = (ArrayList) collection1.clone();
        c1.removeAll(collection2);
        System.out.println("hoc vien trong bo suu tap 1 va 2: ");
        System.out.println(c1);


    }
}
