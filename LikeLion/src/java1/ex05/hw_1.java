package java1.ex05;

import  java.util.Scanner;

public class hw_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = scanner.nextInt();

        if (age >= 20){
            System.out.println("성인입니다.");
        }
    }
}
