package java2.ex02;

import java.util.Scanner;
public class Rabbit {

    static int fib(int n) {
        if (n == 1) return 2;
        if (n == 2) return 2;
        else return fib(n - 1) + fib(n - 2);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        System.out.println(fib(N));
    }
}

//결과를 써보고, 후에 패턴 파악하는 것도 방법이겠다.

//재귀를 짤 때, 과정 하나하나 고민X. 중단값 + 과정만 던지고 알아서 하게 만듦.
