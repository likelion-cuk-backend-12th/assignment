package java1.ex07;

class myInteger {
    int num = 0;

    @Override
    public String toString() {
        return String.valueOf(num);
    }
}

public class hw_1 {
    public static int preIncrease(myInteger num) {
        return ++num.num;
    }

    public static int postIncrease(myInteger num) {
        return num.num++;
    }

    public static void main(String[] args) {
        int a = 0;
        myInteger b = new myInteger();

        System.out.println(a++);
        System.out.println(postIncrease(b));
        System.out.println("a: " + a + " b:" + b.num);
        System.out.println("-----");

        a = 0;
        b.num = 0;
        System.out.println(++a);
        System.out.println(preIncrease(b));
        System.out.println("a: " + a + " b:" + b.num);
        System.out.println("-----");

        a = 0;
        b.num = 0;
        System.out.println(a++ + a++);
        System.out.println(postIncrease(b) + postIncrease(b));
        System.out.println("a: " + a + " b:" + b.num);
        System.out.println("-----");

        a = 0;
        b.num = 0;
        System.out.println(++a + ++a);
        System.out.println(preIncrease(b) + preIncrease(b));
        System.out.println("a: " + a + " b:" + b.num);
        System.out.println("-----");
    }

}
