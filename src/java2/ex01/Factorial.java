package java2.ex01;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력: ");
        int n=sc.nextInt();
        int n_factor =1;
        factor(n, n_factor);
    }

    public static void factor(int n, int n_factor){
        n_factor*=n;
        if(n<=2){
            System.out.println(n_factor);
            return;
        }
        n=n-1;
        factor(n, n_factor);
    }
}
