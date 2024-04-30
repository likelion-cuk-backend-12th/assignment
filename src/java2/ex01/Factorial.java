package java2.ex01;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int facto = factorial(n);
        System.out.println(facto);

    }

    public static int factorial(int n){
        if (n == 0){
            return 1;
        }
        return factorial(n-1) * n;
    }

}
