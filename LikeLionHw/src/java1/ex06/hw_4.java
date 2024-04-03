package java1.ex06;

public class hw_4 {
    public static void main(String[] args) {
        int i = 1;
        while(i <= 100){
            if(i % 3 == 0 && i % 4 == 0)
                System.out.println(i);
            i++;
        }
    }
}
