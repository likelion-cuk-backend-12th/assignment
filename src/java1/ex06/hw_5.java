package java1.ex06;

//별 찍기를 하는 프로그램을 이중 for문을 이용하여 작성하세요.
public class hw_5 {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}