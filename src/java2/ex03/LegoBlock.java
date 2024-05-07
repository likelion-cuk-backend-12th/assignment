package java2.ex03;

import java.util.Scanner;

public class LegoBlock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력: ");
        int n=sc.nextInt();
        int i=sc.nextInt();
        int j=sc.nextInt();
        hanoi(i, 2, j, n);
    }

    public static void hanoi(int i,int m,int j,int n){//i -> j로 원판 이동
       if(n==0) {
           return;
       }
       hanoi(i,j,m,n-1);
       System.out.println(n+"번 레고를 "+i+"에서 "+j+"로 옮깁니다.");
       hanoi(m,i,j,n-1);
    }


}
