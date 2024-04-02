package java1.ex03;

public class hw_4 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        sum(arr);

    }
    public static int sum(int[] arr){
        int total = 0;
        for(int i = 0; i <arr.length; i++){
            total += arr[i];
        }
        System.out.println(total);
        return total;
    }
}
