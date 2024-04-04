package JAVA1.ex06;

public class hw_4 {
    public static void main(String[] args) {
        int num = 1;
        while (num <= 100) {
            if (num % 3 == 0 & num % 4 == 0) {
                System.out.println(num);
            }
            num++;
        }
    }
}
