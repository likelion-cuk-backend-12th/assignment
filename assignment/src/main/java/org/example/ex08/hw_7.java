package org.example.ex08;

public class hw_7 {
    public static void main(String[] args) {
        int num = 10; // 입력 숫자

        // 숫자를 2진수 문자열로 반환
        String binaryString = toBinaryString(num);

        // 결과 출력
        System.out.println("입력된 숫자의 2진수 표현: " + binaryString);
    }

    // 숫자를 2진수 문자열로 반환하는 함수
    public static String toBinaryString(int num) {
        // Integer 클래스의 toBinaryString() 메서드를 사용하여 숫자를 2진수 문자열로 반환
        return Integer.toBinaryString(num);
    }
}
