package org.example.java01.ex06;

// 4. while문을 이용하여 1부터 100까지의 수 중 3의 배수이면서 4의 배수인 수를 출력하는 프로그램을 작성하세요.
//
//     (파일 형식 : hw_4.java)
public class hw_4 {

	public void result() {
		int i = 1;
		while (i <= 100) {
			if (i % 3 == 0 && i % 4 == 0) System.out.println(i);
			i++;
		}
	}

}
