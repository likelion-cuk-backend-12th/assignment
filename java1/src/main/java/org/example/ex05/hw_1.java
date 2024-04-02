package org.example.ex05;

//1. int형 변수 age를 선언하고, 값이 20 이상인 경우 "성인입니다."라는 메시지를 출력하는 프로그램을 작성하세요.
//
//     (파일 형식 : hw_1.java)
//
public class hw_1 {

	private int age;

	public void result(int age) {
		this.age = age;
		if (age >= 20) {
			System.out.println("성인입니다.");
		}
	}
}
