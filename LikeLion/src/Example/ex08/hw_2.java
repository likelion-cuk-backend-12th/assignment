package Example.ex08;

import java.util.Scanner;

public class hw_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(lower(input));
    }

    public static String lower(String str) {
        return str.toLowerCase();
    }
}
