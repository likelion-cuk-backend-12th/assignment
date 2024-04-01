package java1.ex06;

//1부터 10까지의 합을 구하는 프로그램을 while문을 이용하여 작성하세요.
public class hw_1 {
    public static void main(String[] args) {
        int num = 1;
        int sum = 0;

        while (num <= 10) {
            sum += num;
            num++;
        }

        System.out.println("1부터 10까지의 합: " + sum);
    }
}
