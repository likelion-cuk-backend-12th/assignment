package ex01;

import java.util.Scanner;

public class Factorial {
    public static int Factorial(int n){
        if (n == 0 || n == 1){
            return 1;
        }else {
            return n * Factorial(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자를 입력하세요: ");
        int input = scanner.nextInt();
        int result = Factorial(input);
        System.out.println(result);
    }
}
