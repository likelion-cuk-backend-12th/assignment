package java1.ex03;

import java.util.Arrays;

//int형 배열 arr을 받아서 배열의 모든 요소의 합을 계산하여 반환하는 함수 sum을 작성하세요.
public class hw_4 {
    public int sum(int[] arr) {
        return Arrays.stream(arr).sum();
    }
}
