package java2.bouns01;

import java.util.Scanner;

public class N_Queen {

    static int count=0;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("n: ");
        int n=sc.nextInt();
        int[] a= new int[n];
        Queen(0, n, a);
        System.out.println("갯수: "+count);
    }

    public static void Queen(int depth, int n, int[] array) {
        // 모든 원소를 다 채운 상태면 count 증가 및 return
        if (depth == n) {
            count++;
            return;
        }

        for (int i = 0; i < n; i++) {
            array[depth] = i;
            if (Possibility(depth,array)) {
                Queen(depth + 1, n, array);
            }
        }
    }

    public static boolean Possibility(int col, int[] array) {

        for (int i = 0; i < col; i++) {
            if (array[col] == array[i]) {
                return false;
            }
            else if (Math.abs(col - i) == Math.abs(array[col] - array[i])) {
                return false;
            }
        }

        return true;
    }

}
