package java1.ex08;

import java.util.Scanner;

public class hw_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        hw_5 h = new hw_5();
        h.change(num);
    }

    public void change(int num) {
        System.out.println((char)num);
    }
}
