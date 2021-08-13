package TimChuoiTangDan;

import java.util.LinkedList;
import java.util.Scanner;

public class Ascending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String str = sc.nextLine();

        LinkedList<Character> max = new LinkedList<>();

//        TÌM KIẾM CHUỖI TĂNG DẦN CÓ ĐỘ DÀI LỚN NHẤT
        for (int i = 0; i < str.length(); i++) {
//            KHAI BÁO MỘT LINKEDLIST TRUNG GIAN CÁC KÝ TỰ CHUỖI TĂNG DẦN
            LinkedList<Character> list = new LinkedList<>();
//            THÊM KÝ TỰ i VÀO TRONG list
            list.add(str.charAt(i));
            for (int j = i + 1; j < str.length(); j++) {
//                KIỂM TRA KÝ TỰ TIẾP THEO CÓ LỚN HƠN KÝ TỰ CUỐI CÙNG
                if (str.charAt(j) > list.getLast()) {
//                    NẾU CÓ THÌ THÊM VÀO TRONG list
                    list.add(str.charAt(j));
                }
            }
//            SO SÁNH list TRUNG GIAN VÀ list CHỨA CHUỖI
            if (list.size() > max.size()) {
//                NẾU list TRUNG GIAN LỚN HƠN THÌ GÁN LẠI max
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }
//        HIỂN THỊ CHUỖI TĂNG DẦN
        for (Character character : max) {
            System.out.println(character);
        }
        System.out.println();
    }
}
