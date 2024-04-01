package java1.ex05;

import java.util.Scanner;

public class hw_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;

        System.out.print("num1: ");
        num1=sc.nextInt();
        System.out.print("num2: ");
        num2=sc.nextInt();
        int max = (num1 > num2) ? num1 : num2;
        System.out.println(max);
    }
}
