package org.example.ex05;

public class hw_2 {

	private int num;

	public void result(int num) {
		this.num = num;
		if (num > 0) System.out.println("양수입니다.");
		else if(num == 0) System.out.println("0 입니다.");
		else System.out.println("음수입니다.");
	}

}
