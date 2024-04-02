package org.example.java01.ex05;


public class hw_4 {

	private int month;
	private int day;

	public void result(int month, int day) {
		this.month = month;
		this.day = day;

		if (month == 2 && day >= 29){
			System.out.println("윤년입니다.");
			return;
		}
		System.out.println("윤년이 아닙니다.");

	}

}
