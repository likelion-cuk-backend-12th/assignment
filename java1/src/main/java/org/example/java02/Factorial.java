package org.example.java02;

public class Factorial {

	public int result(int current) {
		if (current == 0) return 1;

		return current * result(current - 1);
	}
}
