package org.example.java01.ex04;


public class hw_3 {

	private int num1;
	private int num2;

	public boolean result(int x, int y) {
		this.num1 = x;
		this.num2 = y;
		return num1 % 3 == 0 && num2 % 4 == 0;
	}

}
