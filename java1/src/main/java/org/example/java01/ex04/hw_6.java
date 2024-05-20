package org.example.java01.ex04;


import java.util.Arrays;

public class hw_6 {

	private final int[] arr = {1, 2, 3, 4, 5};

	public void result() {
		Arrays.stream(arr).forEach(System.out::println);
	}

}
