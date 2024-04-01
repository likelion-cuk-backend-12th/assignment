package java1.ex08;

//문자열을 특정 공백을 기준으로 나누어서 String 배열로 반환하는 함수를 작성하세요.
public class hw_6 {
    public static String[] splitString(String input) {
        return input.split("\\s+");
    }
}
