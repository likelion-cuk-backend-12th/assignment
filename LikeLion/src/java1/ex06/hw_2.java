package java1.ex06;

public class hw_2 {
    public static void main(String[] args) {
        int num = 1;
        int sum = 0;

        for (int i = 1; i <= 10; i++){
            if (i % 2 == 0){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
