package Example.ex08;

import java.util.Scanner;

public class hw_3 {
    public static String transformString(String input) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            char transformedChar = transformChar(currentChar);
            result.append(transformedChar);
        }

        return result.toString();
    }

    private static char transformChar(char c) {
        if (Character.isLowerCase(c)) {
            return (char) ('a' + ((c - 'a' + 1) % 26));
        } else if (Character.isUpperCase(c)) {
            return (char) ('A' + ((c - 'A' + 1) % 26));
        } else {
            return c; // 알파벳이 아닌 경우 그대로 반환
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(transformString(input));
    }
}
