package bonus01;
//0100
//0001
//1000
//0010
//
//01000
//00010
//10000
//00100
//00001
import java.util.Scanner;

public class N_Queen {
    static int N, count;
    static int[] col;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        col = new int[N + 1];
        count = 0;
        backtrack(1);
        System.out.println(count);
    }

    private static void backtrack(int row) {
        if (row > N) {
            count++;
            return;
        }

        for (int i = 1; i <= N; i++) {
            col[row] = i;
            if (isValid(row)) {
                backtrack(row + 1);
            }
        }
    }

    static boolean isValid(int row) {
        for (int i = 1; i < row; i++)
            if (col[i] == col[row] || Math.abs(col[row] - col[i]) == row - i)
                return false;
        return true;
    }
}