package Example.ex06;

public class hw_4 {
    public static void main(String[] args) {
        int i = 0;
        while (i < 100) {
            i++;
            if (i % 3 == 0 && i % 4 == 0) {
                System.out.println(i);
            }
        }
    }
}
