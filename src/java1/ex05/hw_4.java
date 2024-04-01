package java1.ex05;

import java.util.Scanner;

public class hw_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month, day;

        System.out.print("월: ");
        month=sc.nextInt();
        System.out.print("일: ");
        day=sc.nextInt();

        if(month==2&&day==29){
            System.out.println("윤년입니다.");
        }else{
            System.out.println("윤년이 아닙니다.");
        }
    }
}
