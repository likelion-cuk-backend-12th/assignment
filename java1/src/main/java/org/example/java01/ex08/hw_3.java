package org.example.java01.ex08;

// 3. a → b, b → c, … , z → a, … , A → B, … , Z → A 로 문자열을 바꾸는 함수를 작성하세요.
// (파일 형식 : hw_3.java)
public class hw_3 {
	public static void main(String[] args) {
		String test = "abcz";
		String result = result(test);
		System.out.println(result);
	}

	public static String result(String temp) {
		char[] charArray = temp.toCharArray();
		StringBuilder stringBuilder = new StringBuilder();

		for (char c : charArray) {
			int ascii = (int) c;

			if (65 <= ascii && ascii < 91){
				ascii = ascii == 90 ? 65 : ascii + 1;
			}
			else if (97 <= ascii && ascii < 123){
				ascii = ascii == 122 ? 97 : ascii + 1;
			}

			char nxt = (char) ascii;
			stringBuilder.append(nxt);
		}
		return stringBuilder.toString();

	}
}
