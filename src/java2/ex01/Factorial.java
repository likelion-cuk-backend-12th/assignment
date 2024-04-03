package java2.ex01;

import java.util.Scanner;

public class Factorial {
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);

    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int nFactorial = factorial(n);
        System.out.println(nFactorial);
    }
}
