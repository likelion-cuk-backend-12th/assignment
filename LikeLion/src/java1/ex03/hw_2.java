package java1.ex03;

import java.util.Scanner;

public class hw_2 {
    int add(int num1, int num2)
    {
        int result = num1 + num2;
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        hw_2 x = new hw_2();
        System.out.println(x.add(a,b));
    }
}
