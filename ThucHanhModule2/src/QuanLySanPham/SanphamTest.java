package QuanLySanPham;

import java.util.ArrayList;
import java.util.Scanner;

public class SanphamTest {
    public static void main(String[] args) {
        ArrayList<Sanpham> danhsachSP = new ArrayList<>();
        int n;
        int luachon;
        int[] Array;

        Scanner sc = new Scanner(System.in);
        System.out.println("1. Thêm sản phẩm. ");
        System.out.println("2. Sửa sản phẩm theo id. ");
        System.out.println("3. Xóa  sản phẩm theo id. ");
        System.out.println("4. Hiển thị sản phẩm. ");
        System.out.println("5. Tìm kiếm sản phẩm theo id. ");
        System.out.println("6. Sắp xếp giảm dần theo giá. ");
        System.out.println("7. Thoát. ");

        do {
            System.out.print("Nhập lựa chọn của bạn: ");
            luachon = Integer.parseInt(sc.nextLine());
            switch (luachon) {
                case 1: {

                }
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    System.out.println("Exit");
                    break;
            }
        } while (luachon !=7);
    }
}
