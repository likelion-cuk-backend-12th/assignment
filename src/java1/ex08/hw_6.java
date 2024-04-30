package java1.ex08;
import java.util.Scanner;

public class hw_6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str;
        str = scanner.nextLine();

        String[] strs = wordMaker(str);
        for (String s : strs) {
            if (s != null) // 초기화되지 않은 요소를 출력하지 않도록 null을 확인합니다.
                System.out.println(s);
        }
    }

    public static String[] wordMaker(String str){
        int cnt = 0;
        StringBuilder sb = new StringBuilder();
        String[] strings = new String[100]; // max = 100

        for (int i = 0; i < str.length(); i++){
            char c = str.charAt(i);

            if (c == ' '){
                String sbString = sb.toString();
                strings[cnt++] = sbString;
                sb = new StringBuilder(); // 새 StringBuilder를 생성하여 초기화1
            }else {
                sb.append(c);
            }
        }

        if (sb.length() > 0) {
            strings[cnt] = sb.toString();
        }

        return strings;
    }
}
