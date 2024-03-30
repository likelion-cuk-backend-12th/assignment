package java1.bonus00;

import java.util.Scanner;

public class bonus00 {
    public static String toTernaryString(int num) {
        return Integer.toString(num, 3);
    }

    public static String toQuinaryString(int num) {
        return Integer.toString(num, 5);
    }

    public static String toTridecimalString(int num) {
        String thirteenDigits = "0123456789ABC";
        StringBuilder result = new StringBuilder();

        while (num > 0) {
            result.insert(0, thirteenDigits.charAt(num % 13));
            num /= 13;
        }
        return result.toString();
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.println(toTernaryString(number));
        System.out.println(toQuinaryString(number));
        System.out.println(toTridecimalString(number));
    }
}
