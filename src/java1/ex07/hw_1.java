package java1.ex07;

//전위 증가 연산자랑 후위 증가 연산자와 같은 “연산자 함수” 를 작성하세요.
public class hw_1 {
    static class myInteger {
        int num = 0;

        public myInteger(int num) {
            this.num = num;
        }
    }

    public static int preIncrease(myInteger num) {
        num.num = num.num + 1;
        return num.num;
    }

    public static int postIncrease(myInteger num) {
        num.num = num.num + 1;
        return num.num - 1;
    }

    public static void main(String[] args) {
        int a = 0;
        myInteger b = new myInteger(0);

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
