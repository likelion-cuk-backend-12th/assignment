package src.java2.ex01;

import java.util.Scanner;

public class Factorial {
    public static int factorial(int num){
        if(num == 1)
            return 1;

        return num * factorial(num-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        System.out.println(input + "! = " + factorial(input));
    }
}
