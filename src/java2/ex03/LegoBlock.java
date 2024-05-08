package src.java2.ex03;

import java.util.Scanner;

public class LegoBlock {
    public static int Lego(int n, int from, int to, int temp){
        if(n == 1)
            System.out.printf("%d번 레고를 %d에서 %d으로 옮깁니다.\n",n,from,to);
        else{
            Lego(n-1, from,temp,to);
            System.out.printf("%d번 레고를 %d에서 %d으로 옮깁니다.\n",n,from,to);
            Lego(n-1, temp,to,from);
        }
        return 0;
    }
    public static void main(String[] args) {
        int n,i,j,k;

        Scanner sc = new Scanner(System.in);
        //n : 블럭 갯수
        //i번째 발판에서 -> j번째 발판으로 이동
        //3 1 3
        n = sc.nextInt();
        i = sc.nextInt();
        j = sc.nextInt();

        if(i != 3 && j != 3)
            k = 3;
        else{
            k = Math.abs(j-i);
        }
        //i = 1 , j = 3 --> k =- 2
        //i = 2 , j = 3 --> k =- 1
        //i = 1 , j = 2 --> k =- 3
        //i = 3 , j = 1 --> k =- 2
        //System.out.println("i = " + i + ", j = " + j + ", k = " + k);
        Lego(n,i,j,k);

    }
}

//n, i, j를 입력하세요.
//        3 1 3
//        1번 레고를 1에서 3로 옮깁니다.
//        2번 레고를 1에서 2로 옮깁니다.
//        1번 레고를 3에서 2로 옮깁니다.
//        3번 레고를 1에서 3로 옮깁니다.
//        1번 레고를 2에서 1로 옮깁니다.
//        2번 레고를 2에서 3로 옮깁니다.
//        1번 레고를 1에서 3로 옮깁니다.