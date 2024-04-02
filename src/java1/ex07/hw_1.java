package java1.ex07;


class myInteger {
    int num = 0;

    @Override
    public String toString(){
        return String.valueOf(num); //toString 쓸수있는이유. 내장함수.
    }
}

public class hw_1 {
    public static int preIncrease(myInteger num) {
        return ++num.num;
    }

    public static int postIncrease(myInteger num) {
        return (num.num++);
        /* int temp = num.num;
           num.num++;
           return temp;
         */ //num 대신 temp 출력하는 방법도 있음.
    }

    public static void main(String[] args) {
        int a = 0;
        myInteger b = new myInteger();

        System.out.println(a++);
        System.out.println(postIncrease(b));
        System.out.println("a: " + a + " b:" + b);
        System.out.println("-----");

        System.out.println(++a);
        System.out.println(preIncrease(b));
        System.out.println("a: " + a + " b:" + b);
        System.out.println("-----");

        System.out.println(a++ + a++);
        System.out.println(postIncrease(b) + postIncrease(b));
        System.out.println("a: " + a + " b:" + b);
        System.out.println("-----");

        System.out.println(++a + ++a);
        System.out.println(preIncrease(b) + preIncrease(b));
        System.out.println("a: " + a + " b:" + b);
        System.out.println("-----");
    }
}
