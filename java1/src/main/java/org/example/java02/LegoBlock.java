package org.example.java02;

import java.util.Scanner;

public class LegoBlock {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String s = scanner.nextLine();
		String[] s1 = s.split(" ");
		int n = Integer.parseInt(s1[0]);
		int i = Integer.parseInt(s1[1]);
		int j = Integer.parseInt(s1[2]);

		Hanoi(n, i, 2, j);

	}

	public static void Hanoi(int N, int start, int mid, int to) {

		// 이동할 원반의 수가 1개라면?
		if (N == 1) {
			System.out.println(start + " " + to + "\n");
			return;
		}

		// A -> C로 옮긴다고 가정할 떄,
		// STEP 1 : N-1개를 A에서 B로 이동 (= start 지점의 N-1개의 원판을 mid 지점으로 옮긴다.)
		Hanoi(N - 1, start, to, mid);

		// STEP 2 : 1개를 A에서 C로 이동 (= start 지점의 N번째 원판을 to지점으로 옮긴다.)
		System.out.println(start + " " + to + "\n");

		// STEP 3 : N-1개를 B에서 C로 이동 (= mid 지점의 N-1개의 원판을 to 지점으로 옮긴다.)
		Hanoi(N - 1, mid, start, to);

	}
}
