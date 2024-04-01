package java1.ex08;

//a → b, b → c, … , z → a, … , A → B, … , Z → A 로 문자열을 바꾸는 함수를 작성하세요.
public class hw_3 {
    public String changeString(String s) {
        String answer = "";
        char[] ch = s.toCharArray();

        for(char c : ch) {
            if(c != 32) {
                if(c == 90 || c == 122) c -= 26;
                c++;
                answer += c;
            } else
                answer += " ";
        }
        return answer;
    }
}
