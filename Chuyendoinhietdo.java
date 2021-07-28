import java.util.Scanner;

public class Chuyendoinhietdo {
        public static void main(String[] args) {
    //            tạo phương thức
            Scanner input = new Scanner(System.in);
            double fahrenheit;
            double celsius;
            int choice;

            do {
                System.out.println("Menu.");
                System.out.println("1. độ F sang độ C");
                System.out.println("2. độ C sang độ F");
                System.out.println("0. Exit");
                System.out.println("Enter your choice: ");
                choice = input.nextInt();

                switch (choice) {
    //                    gọi phương thức chuyển từ độ f sang độ c
                    case 1: {
                        System.out.println("Nhập độ F: ");
                        fahrenheit = input.nextDouble();
                        System.out.println("độ F sang độ C: " + fahrenheitToCelsius(fahrenheit));
                        break;
                    }
    //                    gọi phương thức chuyển từ độ c sang độ f
                    case 2: {
                        System.out.println("Nhập độ C: ");
                        celsius = input.nextDouble();
                        System.out.println("độ C sang độ F: " + celsiusToFahrenheit(celsius));
                        break;
                    }
                    case 0:
                        System.exit(0);
                }
            } while (choice != 0);
        }
    // công thức chuyển đổi độ c sang độ f
        public static double celsiusToFahrenheit(double celsius) {
            double fahrenheit = (9.0 / 5) * celsius + 32;
            return fahrenheit;
        }
    // công thức chuyển đổi độ f sang độ c
        public static double fahrenheitToCelsius(double fahrenheit) {
            double celsius = (5.0 / 9) * (fahrenheit - 32);
            return celsius;
        }
    }
