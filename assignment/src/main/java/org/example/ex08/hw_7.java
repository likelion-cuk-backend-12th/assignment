package org.example.ex08;

import java.util.Scanner;

public class hw_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자 입력:");
        int input = scanner.nextInt();
        String result = decimalToBinary(input);
        System.out.println(result);

    }
    public static String decimalToBinary(int decimal) {
        if (decimal == 0) {
            return "0";
        }

        StringBuilder binary = new StringBuilder();//가변성 문자열 다루는 자바 클래스
        while (decimal > 0) {
            int remainder = decimal % 2;
            binary.insert(0, remainder);
            decimal /= 2;
        }

        return binary.toString();
    }
}
