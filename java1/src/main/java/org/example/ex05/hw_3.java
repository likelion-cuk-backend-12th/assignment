package org.example.ex05;

// 3. int형 변수 score를 선언하고, 값이 90 이상인 경우 "A", 80 이상인 경우 "B", 70 이상인 경우 "C", 그 외에는 "D"라는 학점을 출력하는 프로그램을 작성하세요.
//
//     (파일 형식 : hw_3.java)
//
public class hw_3 {

	private int score;

	public void result(int score) {
		this.score = score;

		if (score >= 90) System.out.println("A");
		else if (score >= 80) System.out.println("B");
		else if (score >= 70) System.out.println("C");
		else System.out.println("D");
	}

}
