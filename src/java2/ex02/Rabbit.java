package java2.ex02;

import java.util.Scanner;

public class Rabbit {

    //static int count=0;//아직 못품...
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력: ");
        int month=sc.nextInt();
        System.out.println(month+"달이 지난 후 토끼는 "+rabbitcount(month)+"마리입니다.");
    }

    public static int rabbitcount(int month){
        int count=0;
        int i=1;
        if(i==1){
            count+=2;
            return count;
        }else if(i<0){
            return count;
        }else{
            count = rabbitcount(month-1)+rabbitcount(month-2);
        }
        return count;
    }
}

