package java1.ex03;

import java.util.Scanner;

public class hw_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for(int i=0; i<arr.length; i++){
            System.out.print("숫자를 입력하세요: ");
            arr[i] = sc.nextInt();
        }

        System.out.println(sum(arr));
    }

    public static int sum(int[] arr){
        int arrsum =0;

        for(int i=0; i<arr.length; i++){
            arrsum+=arr[i];
        }

        return arrsum;
    }
}
