package java1.ex08;

import java.util.Scanner;

public class hw_7 {
    public static String toBinaryString(int num) {
        return Integer.toBinaryString(num);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        String binaryString = toBinaryString(number);
        System.out.println(binaryString);
    }
}
