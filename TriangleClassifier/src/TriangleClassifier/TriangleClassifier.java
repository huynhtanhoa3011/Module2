package TriangleClassifier;

public class TriangleClassifier {
    public static String Triangle (int a, int b, int c) {
        if (a + b > c && b + c > a || a + c > b) {
            if (a == b && b == c) {
                return "equilateral triangle";
            } else if (a == b || a == c) {
                return "isosceles triangle";
            } else {
                return "regular triangle ";
            }
        } else {
            return "not triangle";
        }
    }
}
