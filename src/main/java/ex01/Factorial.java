package ex01;

import java.util.Scanner;

public class Factorial {
    public static int factorial(int N) {
        int result = 1;
        for (int i = 2; i <= N; i++) {
            result *= i;
        }
        return result;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println(factorial(N));
    }
}