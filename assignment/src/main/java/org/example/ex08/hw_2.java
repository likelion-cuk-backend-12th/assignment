package org.example.ex08;

import java.util.Scanner;

public class hw_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("문자열 입력");
        String input = scanner.nextLine();
        String result = input.toLowerCase();
        System.out.println(result);
    }
}