package org.example.ex04;

public class hw_3 {
    public static void main(String[] args) {
        int num1 = 15;
        int num2 = 8;

        if (num1 % 3 == 0 && num2 % 4 == 0) {
            System.out.println("num1을 3으로 나눈 나머지는 0이고, num2를 4로 나눈 나머지도 0입니다.");
        } else {
            System.out.println("num1을 3으로 나눈 나머지가 0이 아니거나, num2를 4로 나눈 나머지가 0이 아닙니다.");
        }
    }
}
