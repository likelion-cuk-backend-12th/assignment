package java1.ex08;

public class hw_3 {
    public static String shiftChar(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if ((ch >= 'a' && ch < 'z') || (ch >= 'A' && ch < 'Z')) {
                ch = (char) (ch + 1);
            } else if (ch == 'z') {
                ch = 'a';
            } else if (ch == 'Z') {
                ch = 'A';
            }
            result.append(ch);
        }
        return result.toString();
    }
}