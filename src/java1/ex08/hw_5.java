package ex08;

import java.util.Scanner;

public class hw_5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        String str = intToString(num);
        System.out.println(str);
    }

    public static String intToString(int num){
        char ch = (char) num;
        return String.valueOf(ch);
    }
}
