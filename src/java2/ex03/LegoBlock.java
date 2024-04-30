package java2.ex03;

import java.util.Scanner;

public class LegoBlock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n, i, j, k;
        System.out.println("n, i, j를 입력하세요.");
        String str = scanner.nextLine();

        String[] numbers = str.split(" ");

        n = Integer.parseInt(numbers[0]);
        i = Integer.parseInt(numbers[1]);
        j = Integer.parseInt(numbers[2]);

        if ((i == 1 && j == 3) || (i == 3 && j == 1))
            k = 2;
        else if ((i == 2 && j == 3) || (i == 3 && j == 2))
            k = 1;
        else if ((i == 1 && j == 2) || (i == 2 && j == 1))
            k = 3;
        else{
            System.out.println("발판은 3개만 존재합니다.");
            return;
        }

        lego(n, i, k, j);

    }

    public static void lego(int n, int i, int k, int j) {
        if (n==0){
            return;
        }

        lego(n-1, i, j, k);
        System.out.println( n+"번 레고를 "+ i +"에서 " + j + "로 옮깁니다.");
        lego(n-1, k, i, j);


    }
}
