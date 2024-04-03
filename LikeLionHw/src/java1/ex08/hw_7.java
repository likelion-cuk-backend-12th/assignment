package java1.ex08;

import java.util.Scanner;

public class hw_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String ans = change(num);
        System.out.println(ans);
    }
    public static String change(int num){
        String str = Integer.toBinaryString(num);
        return str;
    }
}
