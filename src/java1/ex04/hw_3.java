package java1.ex04;

//int형 변수 num1과 num2를 선언하고, 값을 15와 8로 초기화 한 후 num1을 3으로 나눈 나머지가 0이고, num2를 4로 나눈 나머지가 0인지 확인하는 조건문을 작성하세요. (초기화 값은 똑같이 하지 않으셔도 됩니다)
public class hw_3 {
    public static void main(String[] args) {
        int num1 = 15, num2 = 8;
        System.out.println("num1 % 3 == 0 : " + (num1 % 3 == 0));
        System.out.println("num2 % 4 == 0 : " + (num2 % 4 == 0));
    }
}
