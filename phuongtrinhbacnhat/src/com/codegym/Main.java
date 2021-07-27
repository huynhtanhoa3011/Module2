package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	System.out.println("cho phương trình 'a * x + b = c', nhập hằng số: ");
        Scanner scanner = new Scanner(System.in);
        System.out.printf("a: ");
        float a = scanner.nextFloat();
        System.out.printf("b: ");
        float b = scanner.nextFloat();
        if (a == 0) {
            if (b == 0) {
                System.out.printf("phương trình vô số nghiệm");
            } else if (b == 0) {
                System.out.printf("phương trình vô nghiệm");
            }
        } else {
                System.out.printf("phương trình có nghiệm: " + -b/a);

            }
        }
    }

