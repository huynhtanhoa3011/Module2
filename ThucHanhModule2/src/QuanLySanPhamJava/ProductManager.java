package QuanLySanPhamJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProductManager {
    public static void main(String[] args) {
        ArrayList<Product> itemList = new ArrayList<>();
        int n;
        int choose;
        int[] Array;

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Thêm sản phẩm.");
        System.out.println("2. Sửa sản phẩm theo tên.");
        System.out.println("3. Xóa sản phẩm theo tên.");
        System.out.println("4. Hiển thị danh sách sản phẩm.");
        System.out.println("5. Tìm kiếm sản phẩm theo tên.");
        System.out.println("6. Sắp xếp theo thứ tự tăng dần và giảm dần.");
        System.out.println("7. Thoát.");

        do {
            System.out.print("Nhập lựa chọn của bạn: ");
            choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1: {
                    System.out.print("Nhập số lượng sản phẩm cần thêm: ");
                    n = Integer.parseInt(sc.nextLine());
                    Array = new int[n];
                    for (int i = 0; i < Array.length; i++) {
                        Product pr = new Product();
                        System.out.println("Sản phẩm: " + (i + 1));
                        pr.input();
                        itemList.add(pr);
                    }
                    break;
                }
                case 2: {
                    String nameItem;
                    int count = 0;
                    System.out.print("Nhập tên sản phẩm cần sửa: ");
                    nameItem = sc.nextLine();
                    for (Product value : itemList) {
                        if (nameItem.equalsIgnoreCase(value.getItem())) {
                            value.input();
                            count++;
                            break;
                        }
                    }
                    if (count == 0) {
                        System.out.println(nameItem + "\tkhông có trong danh sách sản phẩm cần sửa. ");
                    }
                    System.out.println("\n\t\t=======danh sách sản phẩm sau khi sửa=======");
                    System.out.println("\n\t\tTên          ID           Gía");
                    for (Product product : itemList) {
                        product.display();
                    }
                    System.out.println("\n\t\t===========================================");
                    System.out.println();
                    break;
                }
                case 3: {
                    String nameItem;
                    int count = 0;
                    System.out.print("Tên sản phẩm cần xóa: ");
                    nameItem = sc.nextLine();
                    for (int i = 0; i < itemList.size(); i++) {
                        if (nameItem.equals(itemList.get(i).getItem())) {
                            itemList.remove(itemList.get(i));
                            count++;
                            break;
                        }
                    }
                    if (count == 0) {
                        System.out.println(nameItem + "\tKhông có trong danh sách sản phẩm để xóa.");
                    }
                    System.out.println("\n\t\t=======danh sách sản phẩm sau khi xóa=======");
                    System.out.println("\n\t\tTên          ID           Gía");
                    for (Product product : itemList) {
                        product.display();
                    }
                    System.out.println("\n\t\t===========================================");
                    System.out.println();
                    break;
                }
                case 4: {
                    System.out.println("\n\t\t===========danh sách sản phẩm==============");
                    System.out.println("\n\t\tTên          ID           Gía");
                    for (Product product : itemList) {
                        product.display();
                    }
                    System.out.println("\n\t\t===========================================");
                    System.out.println();
                }
                break;
                case 5: {
                    String nameItem;
                    int count = 0;
                    System.out.print("Nhập tên sản phẩm cần tìm: ");
                    nameItem = sc.nextLine();
                    System.out.println("\n\t\t======danh sách sản phẩm tìm kiếm======");
                    System.out.println("\n\t\tTên          ID           Gía");
                    for (Product product : itemList) {
                        if (nameItem.equalsIgnoreCase(product.getItem())) {
                            product.display();
                            count++;
                        }
                    }
                    if (count == 0) {
                        System.out.println("\tKhông có sản phẩm theo tìm kiếm.");
                    }
                    System.out.println();
                    break;
                }
                case 6: {
                    Collections.sort(itemList, (Product pr1, Product pr2) -> {
                        if (pr1.getPrice() < pr2.getPrice()) {
                            return 1;
                        } else {
                            if (pr1.getPrice() == pr2.getPrice()) {
                                return 0;
                            } else {
                                return -1;
                            }
                        }
                    });
                    System.out.println("\n\t\t====danh sách sau khi giảm dần theo giá====");
                    System.out.println("\n\t\tTên          ID           Gía");
                    for (int i = 0; i < itemList.size(); i++) {
                        itemList.get(i).display();
                    }
                    System.out.println("\n\t\t============================================");
                    System.out.println();
                    break;
                }
                case 7: {
                    System.out.println("Exit");
                    break;
                }
            }

        } while (choose != 7);
    }
}
