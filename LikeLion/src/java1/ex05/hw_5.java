package java1.ex05;

import java.util.Scanner;

public class hw_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println((num1 > num2) ? num1 : num2);
    }
}
