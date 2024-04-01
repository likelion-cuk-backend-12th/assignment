package org.example.ex08;

public class hw_3 {
    public static void main(String[] args) {
        String input = "Hello, World!"; // 입력 문자열

        System.out.println(rotateString(input));
    }

    public static String rotateString(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            char newChar;

            if (ch >= 'a' && ch <= 'z') {
                newChar = (char) ('a' + (ch - 'a' + 1) % 26);
            }
            else if (ch >= 'A' && ch <= 'Z') {
                newChar = (char) ('A' + (ch - 'A' + 1) % 26);
            }
            else {
                newChar = ch;
            }

            result.append(newChar);
        }

        return result.toString();
    }
}
