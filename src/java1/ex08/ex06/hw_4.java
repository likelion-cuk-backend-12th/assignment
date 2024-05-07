package ex06;

public class hw_4 {
    public static void main(String[] args) {
        int idx = 1;
        while(true)
        {
            if(idx > 100)
                break;

            if((idx%3==0)||(idx%4==0))
                System.out.println(idx);
            idx++;
        }
    }
}
