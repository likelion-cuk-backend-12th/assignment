package java1.ex08;

import java.util.Scanner;

public class hw_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(toLowerCase(str));
    }

    public static String toLowerCase(String str) {
        return str.toLowerCase();
    }
}