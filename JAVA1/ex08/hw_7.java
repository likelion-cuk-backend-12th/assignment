package JAVA1.ex08;

public class hw_7 {
        public static void main(String[] args) {
            int number = 10;
            String binaryString = toBinaryString(number);
            System.out.println("2진수 문자열: " + binaryString);
        }

        public static String toBinaryString(int number) {
            return Integer.toBinaryString(number);
        }
}
