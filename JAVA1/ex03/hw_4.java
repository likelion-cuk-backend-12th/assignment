package JAVA1.ex03;

public class hw_4 {
    public static int sum(int[] arr) {
        int total = 0;

        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }

        return total;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int result = sum(arr);
        System.out.println(" 15: " + result);
    }
}
