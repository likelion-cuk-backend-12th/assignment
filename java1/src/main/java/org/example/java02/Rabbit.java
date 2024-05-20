package org.example.java02;

public class Rabbit {
	public static void main(String[] args) {
		System.out.println(result(6));
	}

	public static int result(int current) {
		if (current <= 0){
			return 0;
		}
		if (current == 1){
			return 1;
		}
		return result(current - 2) + result(current - 1);
	}
}
