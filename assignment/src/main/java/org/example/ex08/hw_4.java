package org.example.ex08;

import java.util.Scanner;

public class hw_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("문자열 입력: ");
        String input = scanner.nextLine();
        int result = StringToInt(input);
        System.out.println(result);




    }
    public static int StringToInt(String str){
        int result = 0;
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            result = (int) ch;
        }
        return result;
    }
}
