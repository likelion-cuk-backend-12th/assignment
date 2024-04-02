package Example.ex08;

import java.util.Scanner;

public class hw_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(toBinary(num));
    }

    public static String toBinary(int num) {
        String binary = Integer.toBinaryString(num);
        return binary;
    }
}
