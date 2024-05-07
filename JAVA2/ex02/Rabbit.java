package JAVA2.ex02;

import java.util.Scanner;

public class Rabbit {
    public static long fibonacci(int n) {
        if (n <= 2) {
            return 1;
        }
        long a = 1, b = 1;
        long c = 0;
        for (int i = 3; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of months: ");
        int n = scanner.nextInt();

        System.out.printf("After %d months, there are %d pairs of rabbits.\n", n, fibonacci(n));

        scanner.close();
    }
}

