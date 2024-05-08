package src.java1.ex06;

public class hw_5 {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++)
        {
            for(int j = 1; j <= 5-i; j++)
            {
                System.out.printf("*");
            }
            System.out.printf(" ");
            System.out.println();
        }
    }
}
