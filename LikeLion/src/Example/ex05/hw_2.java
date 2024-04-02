package Example.ex05;

import java.util.Scanner;

public class hw_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("양수입니다.");
        } else if (num < 0) {
            System.out.println("음수입니다.");
        } else {
            System.out.println("0입니다.");
        }
    }
}
