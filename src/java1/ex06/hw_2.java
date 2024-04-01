package java1.ex06;


//1부터 10까지의 짝수를 출력하는 프로그램을 for문을 이용하여 작성하세요.
public class hw_2 {
    public static void main(String[] args) {
        System.out.println("1부터 10까지의 짝수:");

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
