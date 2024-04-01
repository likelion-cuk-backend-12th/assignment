package java1.ex05;

import java.util.Scanner;

public class hw_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1; int num2;
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        int result = (num1 > num2) ? num1 : num2;
        System.out.println(result);

    }
}
