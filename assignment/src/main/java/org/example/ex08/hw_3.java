package org.example.ex08;

import java.util.Scanner;

public class hw_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("문자열 입력: ");
        String input = scanner.nextLine();
        int result = stringToInt(input);
        System.out.println(result);

    }
    public static int stringToInt(String str) {
        return Integer.parseInt(str);
    }
}
