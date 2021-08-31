package service;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    static boolean checkDateTime(String birthday) {
//        String regex = "\\d{1,2}[-|/]\\d{1,2}[-|/]\\d{4}";
        String regex = "([0-2]?[0-9]|(3)[0-1])[-|/](((0)?[0-9])|((1)[0-2]))[-|/](((1)(9)[9][0-9])|((2)(0)[0-1][0-5]))";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(birthday);
        return matcher.matches();
    }
    public static String inputBirthday() {
//        System.out.print("Ngày sinh: ");
        String birthday = new Scanner(System.in).nextLine();
        while (!checkDateTime(birthday)) {
            System.err.println("Ngày tháng không hợp lệ. Nhập lại(1990 -> 2015)");
            System.err.print("Ngày sinh: ");
            birthday = new Scanner(System.in).nextLine();
        }
        return birthday;
    }


    static boolean checkNumberPhone(String numberPhone) {
        String regex = "^0[98753]{1}\\d{8}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(numberPhone);
        return matcher.matches();
    }
    public static String inputNumberPhone() {
        String numberPhone = new Scanner(System.in).nextLine();
        while (!checkNumberPhone(numberPhone)) {
            System.err.println("Số điện thoại không hợp lệ. Nhập lại(đầu số 09, 08, 07, 05, 03)");
            System.err.print("Số điện thoại: ");
            numberPhone = new Scanner(System.in).nextLine();
        }
        return numberPhone;
    }


    static boolean checkName(String name) {
        String regex = "^([AÀẢÃÁẠĂẰẮẲẴẶÂẤẦẨẪẬBCDĐEÈÉẺẼẸÊỀẾỂỄỆFGHIÍÌỈĨỊJKLMNOÒÓỎÕỌÔỒỐỔỖỘƠỜỚỞỠỢPQRSTUÙÚỦŨỤƯỪỨỬỮỰVWXYÝỲỶỸỴZ]" +
                "[aàảãáạăằẳẵắặâầẩẫấậbcdđeèẻẽéẹêềểễếệfghiìỉĩíịjklmnoòỏõóọôồổỗốộơờởỡớợpqrstuùủũúụưừửữứựvwxyỳỷỹýỵz]+[ ]*)+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }
    public static String inputName() {
        String name = new Scanner(System.in).nextLine();
        while (!checkName(name)) {
            System.err.println("Tên không hợp lệ. Nhập lại(chữ cái đầu viết hoa(VD: Lê Hiếu))");
            System.err.print("Tên: ");
            name = new Scanner(System.in).nextLine();
        }
        return name;
    }
}
