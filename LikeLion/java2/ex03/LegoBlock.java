package ex03;

import java.util.Scanner;

public class LegoBlock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 사용자로부터 입력 받기
        System.out.print("n, i, j 를 입력하세요. ");
        int N = scanner.nextInt();
        int i = scanner.nextInt();
        int j = scanner.nextInt();

        // 하노이 탑 알고리즘 호출
        moveHanoi(N, i, j);
    }

    // 하노이 탑 알고리즘 구현
    public static void moveHanoi(int N, int start, int end) {
        if (N == 1) {
            System.out.println(N + "번 레고를 "+ start +"에서 " + end + "로 이동");
        } else {
            int other = 6 - start - end; // 중간 발판 계산

            // N-1개의 원판을 중간 발판으로 옮기고
            moveHanoi(N - 1, start, other);

            // 마지막 원판을 목표 발판으로 옮기고
            System.out.println(N + "번 레고를 "+ start +"에서 " + end + "로 이동");

            // 중간 발판에 있는 N-1개의 원판을 목표 발판으로 옮김
            moveHanoi(N - 1, other, end);
        }
    }
}
