package ProductManager;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;

public class ProductManager {
    private static int id = 0;
    static int count = 0;
    static CheckInput checkInput = new CheckInput();
    static List<Product> productList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choose;
        do {
            showMenu();
            choose = checkInput.checkInteger(1, 9);
            switch (choose) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    editProductById();
                    break;
                case 3:
                    deleteProductById();
                    break;
                case 4:
                    displayProduct();
                    break;
                case 5:
                    rankProductByPrice();
                    break;
                case 6:
                    findProductByName();
                    break;
                case 7:
                    saveFile(productList);
                    break;
                case 8:
                    readFile();
                    break;
                case 9:
                    System.out.println("Thoát");
                    break;
                default:
            }
        } while (choose != 9);
    }

    private static void addProduct() {
        System.out.print("Nhập số sản phẩm cần thêm: ");
        int n = checkInput.checkInteger(1, 10);
        for (int i = 0; i < n; i++) {
            id = ++count;
            System.out.print("Nhập sản phẩm " + id + ":\t");
            String name = checkInput.checkString();
            System.out.print("Nhập nguồn gốc xuất sứ: ");
            String made = checkInput.checkString();
            System.out.print("Nhập giá sản phẩm: ");
            Double price = checkInput.checkDouble(1, 1000000);
            productList.add(new Product(name, made, price));
        }
    }

    private static void editProductById() {
        System.out.print("Nhập ID sản phẩm cần chỉnh sửa: ");
        int idproduct = checkInput.checkInteger(1, productList.size());
        for (int i = 0; i < productList.size(); i++) {
            if (idproduct == productList.get(i).getId()) {
                System.out.print("Tên sản phẩm mới: ");
                productList.get(i).setName(checkInput.checkString());
                System.out.print("Nguồn gốc xuất sứ: ");
                productList.get(i).setMade(checkInput.checkString());
                System.out.print("Gía: ");
                productList.get(i).setPrice(checkInput.checkDouble(1, 1000000));
                break;
            }
        }
        System.out.println("\n\t\t============DANH SÁCH SẢN PHẨM SAU KHI SỬA============");
        System.out.println("\n\t\tTên                ID            Made            Price");
        for (Product product : productList) {
            product.display();
        }
        System.out.println("\n\t\t======================================================");
        System.out.println();
    }

    private static void deleteProductById() {
        System.out.print("Nhập ID sản phẩm cần xóa: ");
        int id = checkInput.checkInteger(1, productList.size());
        for (Product product : productList) {
            if (product.getId() == id) {
            productList.remove(product);
            break;
            }
        }
        System.out.println("\n\t\t==============DANH SÁCH SẢN PHẨM SAU KHI XÓA==========");
        System.out.println("\n\t\tTên                ID            Made            Price");
        for (Product product : productList) {
            product.display();
        }
        System.out.println("\n\t\t======================================================");
        System.out.println();
    }

    private static void displayProduct() {
        System.out.println("\n\t\t====================DANH SÁCH SẢN PHẨM================");
        System.out.println("\n\t\tTên                ID            Made            Price");
        for (Product product : productList) {
            product.display();
        }
        System.out.println("\n\t\t======================================================");
        System.out.println();
    }

    private static void rankProductByPrice() {
        Collections.sort(productList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getPrice() > o2.getPrice()) {
                    return -1;
                }
                return 1;
            }
        });
        System.out.println("\n\t\t===========DANH SÁCH SẢN PHẨM SAU KHI SẮP XẾP=========");
        System.out.println("\n\t\tTên                ID            Made            Price");
        for (Product product : productList) {
            product.display();
        }
        System.out.println("\n\t\t======================================================");
        System.out.println();
    }

    private static void findProductByName() {
        String name;
        System.out.print("Nhập tên sản phẩm: ");
        name = sc.nextLine();
        System.out.println("\n\t\t=============DANH SÁCH SẢN PHẨM SAU KHI TÌM===========");
        System.out.println("\n\t\tTên                ID            Made            Price");
        for (Product product : productList) {
            if (name.equalsIgnoreCase(product.getName())) {
                product.display();
                System.out.println("\n\t\t======================================================");
                System.out.println();
                break;
            }
        }
    }

    private static void saveFile(List<Product> productList) {
        try {
            FileWriter file = new FileWriter("product.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(file);
            for (Product product : productList) {
                bufferedWriter.write(product.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            file.close();
        } catch (Exception e) {

        }
    }

    private static void readFile() {
        List<Product> productList = new ArrayList<>();
        String line;
        try {
            FileReader file = new FileReader("product.txt");
            BufferedReader bufferedReader = new BufferedReader(file);
            showMenu();
            do {
                line = bufferedReader.readLine();
                System.out.println(line);
            } while (line != null);
            bufferedReader.close();
            file.close();
        } catch (Exception e) {

        }
    }

    static void showMenu() {
        System.out.println("======================MENU=====================");
        System.out.println("|    1. Thêm sản phẩm                         |");
        System.out.println("|    2. Sửa sản phẩm theo id                  |");
        System.out.println("|    3. Xóa sản phẩm theo id                  |");
        System.out.println("|    4. Hiển thị danh sách sản phẩm           |");
        System.out.println("|    5. Sắp xếp sản phẩm giảm dần theo giá    |");
        System.out.println("|    6. Tìm kiếm sản phẩm                     |");
        System.out.println("|    7. Lưu file                              |");
        System.out.println("|    8. Đọc file                              |");
        System.out.println("|    9. Thoát                                 |");
        System.out.println("===============================================");
        System.out.print("Nhập lựa chọn của bạn: ");
    }
}
