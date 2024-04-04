package JAVA1.ex08;

public class hw_6 {
    public static void main(String[] args) {
        String str = "apple banana cherry";
        String[] result = splitString(str);

        System.out.println("분할된 문자열:");
        for (String s : result) {
            System.out.println(s);
        }
    }

    public static String[] splitString(String str) {
        return str.split("\\s+");
    }
}
