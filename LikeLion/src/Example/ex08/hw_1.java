package Example.ex08;

import java.util.Scanner;

public class hw_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(upper(input));
    }

    public static String upper(String str) {
        return str.toUpperCase();
    }
}
