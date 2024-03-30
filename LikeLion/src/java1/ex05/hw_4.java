package java1.ex05;

import java.util.Scanner;

public class hw_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        int day = scanner.nextInt();

        if (month == 2 && day >= 29){
            System.out.println("윤년입니다.");
        } else {
            System.out.println("윤년이 아닙니다.");
        }
    }
}
