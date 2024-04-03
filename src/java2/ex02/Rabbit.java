package java2.ex02;

import java.util.Scanner;

public class Rabbit {
    public static int recall(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        if (n == 3) {
            return 2;
        }
        return 2 * recall(n - 1) - 1;
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int nPair = recall(n);
        System.out.println(nPair);
    }

}
