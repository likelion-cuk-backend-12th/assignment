package ex02;

import java.util.Scanner;

public class Rabbit {
    public static int Rabbit(int n){
        if (n == 1 || n == 2){
            return 1;
        }else {
            int result = Rabbit(n-1) + Rabbit(n-2);
            return result;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("토끼 수를 입력하세요(쌍 기준): ");
        int input = scanner.nextInt();
        int result = Rabbit(input);
        System.out.println(result + "쌍," + (result * 2) + "마리입니다.");




    }
}
