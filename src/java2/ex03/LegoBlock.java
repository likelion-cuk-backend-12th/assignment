package java2.ex03;

import java.util.Scanner;

public class LegoBlock {
    static int N;
    static char start = 'A';
    static char end = 'C';
    static char work = 'B';

    static void hanoi(int N, char start, char end, char work) {
        if (N == 1) {
            System.out.println(start + "에 있는 레고를 " + end + "로 이동");
            return;
        } else {
            hanoi(N - 1, start, work, end);
            hanoi(1, start, end, work);
            hanoi(N - 1, work, end, start);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        hanoi(N, 'A', 'C', 'B');
    }
}
