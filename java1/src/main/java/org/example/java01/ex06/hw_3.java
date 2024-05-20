package org.example.java01.ex06;

// 3. 구구단을 출력하는 프로그램을 중첩 for문을 이용하여 작성하세요.
//
//     (파일 형식 : hw_3.java)
//
public class hw_3 {

	public void result() {
		for (int i = 1; i < 10; i++){
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}
		}
	}

}
