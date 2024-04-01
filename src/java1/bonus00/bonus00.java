package java1.bonus00;

import java.util.Scanner;

public class bonus00 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("입력: ");
        int num = sc.nextInt();
        convertThreeBase(num);
        convertFiveBase(num);
        convertThirteen(num);
    }


    public static void convertThreeBase(int num){
        long ThreeBase = 0;

        System.out.println("3진수 변환"+ThreeBase);
    }
    public static void convertFiveBase(int num){
        long FiveBase = 0;
        System.out.println("5진수 변환"+FiveBase);
    }
    public static void convertThirteen(int num){
        long Thirteen = 0;
        System.out.println("5진수 변환"+Thirteen);
    }

}
