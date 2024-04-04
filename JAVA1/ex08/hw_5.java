package JAVA1.ex08;

public class hw_5 {
        public static void main(String[] args) {
            int num = 12345;
            String result = integerToString(num);
            System.out.println("변환된 문자열: " + result);
        }

        public static String integerToString(int num) {
            return String.valueOf(num);
        }
}
