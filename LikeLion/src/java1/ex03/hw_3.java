package java1.ex03;

import java.util.Scanner;

public class hw_3 {
    double calcArea(double r) {
        double res = Math.pow(r,2) * Math.PI ;
        return res ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        hw_3 x = new hw_3();
        System.out.print("반지름: ");
        double r = sc.nextDouble();
        double calcArea = x.calcArea(r);
        System.out.println("원의 넓이: " + calcArea);
    }
}
