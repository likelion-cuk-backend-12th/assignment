package ex02;

import java.util.Scanner;

public class Rabbit {
    public static int countRabbits(int month) {
        if (month <= 2) {
            return 1;
        } else {
            return countRabbits(month - 1) + countRabbits(month - 2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int totalRabbits = countRabbits(N);
        System.out.println(totalRabbits * 2);
    }
}