package org.example.ex08;

import java.util.Scanner;

public class hw_6 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("문자열을 입력하세요:");
            String inputString = scanner.nextLine();
            scanner.close();

            // 문자열을 공백을 기준으로 나누기
            String[] splittedArray = splitString(inputString);

            // 결과 출력
            System.out.println("Split String Array:");
            for (String str : splittedArray) {
                System.out.println(str);
            }
        }
        public static String[] splitString(String input) {
            // 입력 문자열을 공백을 기준으로 나누어 배열로 반환
            return input.split("\\s+");
        }
    }

