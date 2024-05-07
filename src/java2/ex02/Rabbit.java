package src.java2.ex02;

import java.util.Scanner;

public class Rabbit {

    public static int Fibonacci(int num){
       // System.out.println(num);
        if(num == 0)
            return 0;
        else if(num == 1)
            return 1;

        return Fibonacci(num -1) + Fibonacci(num -2);
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        System.out.println("Fibonacci(n) = " + Fibonacci(n)*2);

    }
}
