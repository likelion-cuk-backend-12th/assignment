package java2.ex02;

import java.util.Scanner;

public class Rabbit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int cnt = rabbit(n);

    }

    public static int rabbit(int n) {
        if (n == 1 || n == 2){
            return 1;
        }
        return rabbit(n-1) + rabbit(n-2);
    }

}
