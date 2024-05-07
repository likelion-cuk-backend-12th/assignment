package bonus00;

import java.util.ArrayList;
import java.util.Scanner;

public class bonus00 {
    public static void convertThreeBase(int num) {
        String threeBase = "";

        while(num != 0){
            int val = num%3;
            threeBase += Integer.toString(val);
            num /= 3;
        }

        for(int i = threeBase.length()-1; i >= 0; i--)
            System.out.printf("%s",threeBase.charAt(i));
        System.out.println();
    }

    public static void convertFiveBase(int num) {
        String fiveBase = "";

        while(num != 0){
            int val = num%5;
            fiveBase += Integer.toString(val);
            num /= 5;
        }

        for(int i = fiveBase.length()-1; i >= 0; i--)
            System.out.printf("%s",fiveBase.charAt(i));
        System.out.println();
    }

    public static void convertThirteen(int num) {
        String thirteenBase = "";

        while(num != 0){
            int val = num%13;
            String tmp ="";
            if(val >= 10)
            {
                switch (val){
                    case 10:
                        tmp = "A";
                        break;
                    case 11:
                        tmp = "B";
                        break;
                    case 12:
                        tmp = "C";
                        break;
                }
            }
            else {
                tmp = Integer.toString(val);
            }
            thirteenBase += tmp;
            num /= 13;
        }

        for(int i = thirteenBase.length()-1; i >= 0; i--)
            System.out.printf("%s",thirteenBase.charAt(i));
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input_val = sc.nextInt();
        convertThreeBase(input_val);
        convertFiveBase(input_val);
        convertThirteen(input_val);
    }
}
