package src.java2.bonus01;
//n*n 체스파
//n개의 퀸

import java.util.Scanner;

public class N_Queen {
    private static int n =0;
    //퀸 갯수, 현재 행, 배열
    public static int backTracking(int queen, int curRow, int[][] arr){
        int result = 0;

        System.out.println("****queen = " + queen + "****");
        for(int i = 0; i < n; i++){
            for(int j = 0; j <n; j++)
                System.out.print(arr[i][j]);
            System.out.println();
        }
        System.out.println("*****************\n");

        //퀸을 다 배치하면 탈출
        if(queen == 0) {
            System.out.println("COUNT!!");
            return 1;
        }
        for(int col = 0; col < arr[curRow].length; col++)
        {
            if(isAvailable(curRow,col,arr)) {
                arr[curRow][col] = 1;
                result +=backTracking(queen - 1, curRow + 1, arr);
                //해당 위치가 틀렸을 경우 백
                arr[curRow][col] = 0;
            }
        }

        return result;
    }
    //i == row, j == col
    public static boolean isAvailable(int row, int col, int[][] arr){
        // 같은 열에 퀸이 있는지 확인
        for (int i = 0; i < row; i++) {
            if (arr[i][col] == 1)
                return false;
        }

        // 왼쪽 대각선에 퀸이 있는지 확인
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (arr[i][j] == 1)
                return false;
        }

        // 오른쪽 대각선에 퀸이 있는지 확인
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (arr[i][j] == 1)
                return false;
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        int[][] arr = new int[n][n];

        System.out.println("result = " + backTracking(n,0,arr));
//        for(int i = 0; i < arr.length; i++){
//            for(int j = 0; j <arr[i].length; j++)
//                System.out.print("arr = " + arr[i][j]);
//                //arr[i][j] = 2;
//            System.out.println();
//        }

    }
}
