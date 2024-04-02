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
        String ThreeBase = Integer.toString(num, 3);
        System.out.println("3진수 변환: "+ThreeBase);
    }
    public static void convertFiveBase(int num){
        String FiveBase = Integer.toString(num, 5);
        System.out.println("5진수 변환: "+FiveBase);
    }
    public static void convertThirteen(int num){
        String Thirteen = Integer.toString(num, 13);;
        System.out.println("13진수 변환: "+Thirteen);
    }

}
