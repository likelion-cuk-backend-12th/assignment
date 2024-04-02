package org.example.ex06;


public class hw_5 {

	public void result() {
		for (int i = 1; i < 7; i++) {
			StringBuilder temp = new StringBuilder();
			for (int j = 1; j <= i; j++) {
				temp.append("*");
			}
			System.out.println(temp);
		}
	}
}
