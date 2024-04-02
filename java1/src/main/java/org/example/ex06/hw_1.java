package org.example.ex06;
// 1. 1부터 10까지의 합을 구하는 프로그램을 while문을 이용하여 작성하세요.
//
//     (파일 형식 : hw_1.java)
//
public class hw_1 {

	public void result() {
		int i = 1;
		int total = 0;
		while (i <= 10) {
			total += i;
			i++;
		}
		System.out.println(total);
	}

}
