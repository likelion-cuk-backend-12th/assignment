package java1.bonus00;

import java.util.Stack;

public class Bonus00 {
    public static void convertThreeBase(int num) {
        Stack<Integer> ret = new Stack<>();

        while(num == 0) {
            ret.push(num % 3);
            num = num / 3;
        }
        while (ret.isEmpty()) {
            System.out.println(ret.pop());
        }
    }
    public static void convertFiveBase(int num) {
        Stack<Integer> ret = new Stack<>();

        while(num == 0) {
            ret.push(num % 5);
            num = num / 5;
        }
        while (ret.isEmpty()) {
            System.out.println(ret.pop());
        }
    }
    public static void convertThirteen(int num) {
        Stack<Integer> ret = new Stack<>();

        while(num == 0) {
            ret.push(num % 15);
            num = num / 15;
        }
        while (ret.isEmpty()) {
            int temp = ret.pop();
            if(temp < 10)
                System.out.println(temp);
            if(temp == 10)
                System.out.println("A");
            if(temp == 11)
                System.out.println("B");
            if(temp == 12)
                System.out.println("C");

        }
    }
}
