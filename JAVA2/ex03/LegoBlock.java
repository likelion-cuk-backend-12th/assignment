package JAVA2.ex03;

import java.util.Scanner;

public class LegoBlock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int i = scanner.nextInt();
        int j = scanner.nextInt();
        scanner.close();

        int k = 6 - i - j;
        moveBlocks(N, i, j, k);
    }

    public static void moveBlocks(int n, int from, int to, int aux) {
        if (n == 0) return;

        moveBlocks(n - 1, from, aux, to);

        System.out.println("블록 " + n + "를 " + from + "에서 " + to + "로 이동");

        moveBlocks(n - 1, aux, to, from);
    }
}

