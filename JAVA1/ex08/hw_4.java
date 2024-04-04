package JAVA1.ex08;

public class hw_4 {
        public static void main(String[] args) {
            String str = "12345";
            int result = stringToInteger(str);
            System.out.println("변환된 정수: " + result);
        }

        public static int stringToInteger(String str) {
            // Integer.parseInt() 메서드를 사용하여 문자열을 정수로 변환
            return Integer.parseInt(str);
        }
}
