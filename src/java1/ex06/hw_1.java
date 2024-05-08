package src.java1.ex06;

public class hw_1 {
    public static void main(String[] args) {
        int sum =0;
        int idx = 1;
        while(true){
            if(idx > 10)
                break;
            sum += idx;
            idx++;
        }

        System.out.println("sum = " + sum);
    }
}
