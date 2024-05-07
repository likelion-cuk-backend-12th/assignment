package java1.ex08;

import java.util.Scanner;

public class hw_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("입력: ");
        int num = sc.nextInt();
        long binarynum = Long.parseLong(Integer.toBinaryString(num));
        System.out.println(binarynum);

    }
}
