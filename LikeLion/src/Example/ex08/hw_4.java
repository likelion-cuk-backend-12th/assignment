package Example.ex08;

public class hw_4 {
    public static void main(String[] args) {
        String a = "1234";
        int b = 1;
        System.out.println(strToInt(a) + b);
    }

    public static int strToInt(String str) {
        return Integer.parseInt(str);
    }
}
