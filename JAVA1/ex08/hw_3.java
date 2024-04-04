package JAVA1.ex08;

public class hw_3 {
        public static void main(String[] args) {
            String input = "Hello, World!";
            String result = shiftCharacters(input);
            System.out.println("변환 전: " + input);
            System.out.println("변환 후: " + result);
        }

        public static String shiftCharacters(String input) {
            char[] chars = input.toCharArray();

            for (int i = 0; i < chars.length; i++) {
                char c = chars[i];

                if (c >= 'a' && c < 'z') {
                    chars[i] = (char) (c + 1);
                }
                else if (c >= 'A' && c < 'Z') {
                    chars[i] = (char) (c + 1);
                }
                else if (c == 'z') {
                    chars[i] = 'a';
                }
                else if (c == 'Z') {
                    chars[i] = 'A';
                }
            }

            return new String(chars);
        }
}
