package java1.ex08;

import java.util.Arrays;

public class hw_6 {
    static void trans(String str){
        String[] arr = str.split(" ");
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        String str = "안녕하세요 저는 사람입니다";

        trans(str);
    }
}
