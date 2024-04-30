package java1.ex08;

import java.util.Scanner;

public class hw_5 {
    public static String intToString(int num) {
        return Integer.toString(num);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        String result = intToString(num);
        System.out.println(result);
    }
}
