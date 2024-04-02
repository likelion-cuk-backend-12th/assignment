package org.example.ex08;

import java.util.Scanner;

public class hw_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수를 입력하세요: ");
        int input = scanner.nextInt();

        String str = intToString(input);
        System.out.println(str);

    }
    public static String intToString(int input){
        char ch = (char) input;
        return String.valueOf(ch);
        }
    }

