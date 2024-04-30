package java1.ex08;

import java.util.Scanner;

public class hw_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(toUpperCase(str));
    }

    public static String toUpperCase(String str) {
        return str.toUpperCase();
    }
}