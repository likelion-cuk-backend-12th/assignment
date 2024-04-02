package java1.ex04;

public class hw_3 {
    public static void main(String[] args) {
        int num1 = 15;
        int num2 = 8;

        // num1을 3으로 나눈 나머지가 0이고, num2를 4로 나눈 나머지가 0인지 확인하는 조건문
        if (num1 % 3 == 0 && num2 % 4 == 0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}