package java1.ex03;

import java.util.Scanner;

public class hw_4 {
    public static int sum(int[] arr) {
        int total = 0;
        for (int num : arr) {
            total += num;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("배열 크기: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        System.out.println("배열 요소 입력:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        int result = sum(arr);
        System.out.println(result);
    }
}
