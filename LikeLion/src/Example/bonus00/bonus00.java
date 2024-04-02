package Example.bonus00;

import java.util.Scanner;

public class bonus00 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        convertThreeBase(num);
        convertFiveBase(num);
        convertThirteen(num);
    }

    public static void convertThreeBase(int num) {
        System.out.println(Integer.toString(num,3));
    }
    public static void convertFiveBase(int num) {
        System.out.println(Integer.toString(num,5));
    }
    public static void convertThirteen(int num) {
        System.out.println(Integer.toString(num,13));
    }
}
