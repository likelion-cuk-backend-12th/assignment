package java1.ex08;

import java.util.Scanner;

public class hw_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        hw_4 h = new hw_4();
        h.change(str);
    }

    public void change(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + 1 + " ");
        }
    }
}