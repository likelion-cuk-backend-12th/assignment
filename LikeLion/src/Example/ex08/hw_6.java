package Example.ex08;

import java.util.Arrays;
import java.util.Scanner;

public class hw_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(space(str));
    }
    public static String space(String str) {
        String list[] = str.split(" ");
        return Arrays.toString(list);
    }
}
