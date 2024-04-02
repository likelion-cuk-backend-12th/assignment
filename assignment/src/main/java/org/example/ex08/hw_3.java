package org.example.ex08;

import java.util.Scanner;

public class hw_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("문자 입력하세요: ");
        String input = scanner.nextLine();
        String result = nextChar(input);
        System.out.println(result);
    }

    public static String nextChar(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            char newCh;
            if (ch >= 'a' && ch <= 'z') {
                newCh = (char) (ch + 1);
            } else if (ch >= 'A' && ch <= 'Z') {
                newCh = (char) (ch + 1);
            }
            else newCh = ch;

            result += newCh;
        }
        return result;
    }
}
