package java1.ex04;

import java.util.Arrays;

//int형 배열 arr을 선언하고, 값 {1, 2, 3, 4, 5}를 할당한 후 배열의 모든 요소를 출력하는 프로그램을 작성하세요.
public class hw_6 {
    public static void main(String[] args) {
        int[] arg = {1, 2, 3, 4, 5};
        Arrays.stream(arg).forEach(System.out::println);
    }
}
