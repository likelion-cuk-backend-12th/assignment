package java1.ex08;

import java.util.Scanner;

public class hw_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char input = sc.next().charAt(0);
        char nextChar = (char)(input+1);
        System.out.println(nextChar);
    }
}
