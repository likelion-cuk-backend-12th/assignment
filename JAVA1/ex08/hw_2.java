package JAVA1.ex08;

public class hw_2 {
    public static void main(String[] args) {
        String input = "Hello, World!";
        String result = toLowerCase(input);
        System.out.println("변환 전: " + input);
        System.out.println("변환 후: " + result);
    }

    public static String toLowerCase(String input) {
        return input.toLowerCase();
    }
}
