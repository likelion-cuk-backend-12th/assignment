package org.example.java02;

public class RecLion {

	public void result(int i) {
		if (i > 10){
			return;
		}
		System.out.println("Hello Baby Lion " + i);
		result(i + 1);
	}
}
