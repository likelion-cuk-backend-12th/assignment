package ex03;

import java.util.Scanner;
public class LegoBlock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n, i, j를 입력하세요.");
        String[] inputs = scanner.nextLine().split(" ");
        int N = Integer.parseInt(inputs[0]);
        int i = Integer.parseInt(inputs[1]);
        int j = Integer.parseInt(inputs[2]);

        moveLego(N, i, j);
    }

    public static void moveLego(int N, int source, int destination) {
        if (N == 1) {
            System.out.println("1번 레고를 " + source + "에서" + destination + "로 옮깁니다.");
        } else {
            int auxiliary = 6 - source - destination;
            moveLego(N - 1, source, auxiliary);
            System.out.println(N + "번 레고를 " + source + "에서" + destination + "로 옮깁니다.");
            moveLego(N - 1, auxiliary, destination);
        }
    }
}
