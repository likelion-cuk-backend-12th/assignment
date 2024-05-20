package org.example.java01.ex05;

public class hw_5 {

	private int num1;
	private int num2;

	public void result(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;

		int bigger = (num1 > num2) ? num1 : num2;

		System.out.println(bigger);

	}

}
