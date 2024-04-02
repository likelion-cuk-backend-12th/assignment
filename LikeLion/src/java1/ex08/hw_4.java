package java1.ex08;

import java.util.Scanner;

public class hw_4 {
    public static int stringToInt(String str) {
        return Integer.parseInt(str);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        int result = stringToInt(str);
        System.out.println(result);
    }
}
