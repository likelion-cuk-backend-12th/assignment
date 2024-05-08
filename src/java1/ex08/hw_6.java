package src.java1.ex08;

public class hw_6 {
    public static void main(String[] args) {
        String str = "a,b,c";

        String[] arr = str.split(",");

        for(int i =0 ; i < arr.length; i++){
            System.out.println(arr[i]);

        }
    }
}
